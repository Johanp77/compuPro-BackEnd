package com.sena.compupro.dao;

import com.sena.compupro.model.User;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDaoImp implements UserDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<User> getUsers() {
        String query = "FROM User";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void delete(Long userID) {
        User user = entityManager.find(User.class ,userID);
        entityManager.remove(user);
    }

    @Override
    public void register(User user) {
        entityManager.merge(user);
    }

    public User obtainUserByCredentials(User user){
        String query = "FROM User WHERE email= :email";
            List <User> list = entityManager.createQuery(query)
                .setParameter("email", user.getEmail() )
                    .getResultList();

            if(list.isEmpty()){
                return null;
            }

            String passwordHassed = list.get(0).getPassword();

            Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
            if(argon2.verify(passwordHassed, user.getPassword())){
                return list.get(0);
            }
            return null;
//            return !list.isEmpty();
    }
}
