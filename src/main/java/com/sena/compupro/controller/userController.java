package com.sena.compupro.controller;


import com.sena.compupro.dao.UserDao;
import com.sena.compupro.model.User;
import com.sena.compupro.utils.JWTUtil;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:3000" )
//@CrossOrigin(origins = "http://192.168.1.142:3000")
@CrossOrigin(origins = {"http://192.168.1.142:3000", "http://localhost:3000"})
public class userController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/users/{userID}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long userID) {
        User  user = new User();
        user.setUserID(userID);
        user.setUser_name("Lucas");
        user.setEmail("");
        user.setPassword("");
        user.setCreate_time("");
        user.setClient_address("");
        user.setClient_phone("");
        return user;
    }


    @RequestMapping(value = "api/users", method = RequestMethod.POST)
    public void registerUser(@RequestBody User user) {

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, user.getPassword());
        user.setPassword(hash);

        //Build a conditional that returns something in case of success/fail

        userDao.register(user);
    }


    //This function return a list of users in JSON format.
    @RequestMapping(value = "api/users", method = RequestMethod.GET)
    public List<User> getUsers(@RequestHeader(value="Authorization") String token) {
        if(!verifyToken(token)) {return  null; }

        return userDao.getUsers();

    }



    private boolean verifyToken(String token){
        String userTokenID = jwtUtil.getKey(token);
        if(token == null){
            return false;
        }
            return userTokenID != null;
    }

    @RequestMapping(value= "api/verification", method = RequestMethod.GET)
    public boolean verifyUserStatus(@RequestHeader(value = "Authorization") String token){
        if(verifyToken(token)){
            return true;
        }else if (verifyToken(null)){
            return false;
        }
        return false;
    }

    @RequestMapping(value = "api/users/{userID}", method = RequestMethod.DELETE)
    public void delete(@RequestHeader(value="Authorization") String token, @PathVariable Long userID){
        if(!verifyToken(token)) {return; }

        userDao.delete(userID);
    }


    //Construir las otras funciones (editar, eliminar, actualizar y buscar.

}
