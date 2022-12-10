package com.sena.compupro.dao;


import com.sena.compupro.model.Cart;
import com.sena.compupro.model.Product;
import com.sena.compupro.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class CartDaoImp implements CartDao {

    @PersistenceContext
    EntityManager entityManager;


    @Transactional
//    @Override
    public void addToCart(Product product){
    entityManager.merge(product);
    }

//    public User findCartByClient(User user){
//        String query = "FROM User WHERE user_id= :user_id";
//        List <User> list = entityManager.createQuery(query)
//                .setParameter("email", user.getEmail() )
//                .getResultList();
//        return list;
//    }


//    public List<Product> get


}
