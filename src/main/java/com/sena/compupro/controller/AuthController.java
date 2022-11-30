package com.sena.compupro.controller;

import com.sena.compupro.dao.UserDao;
import com.sena.compupro.model.User;
import com.sena.compupro.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody User user) {


        User userLogued = userDao.obtainUserByCredentials(user);
        if (userLogued != null) {

            String tokenJWT = jwtUtil.create(String.valueOf(userLogued.getUserID()), userLogued.getEmail());

            return tokenJWT;
        }
        return "FAIL";
    }

}
