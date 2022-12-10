package com.sena.compupro.controller;


import com.sena.compupro.dao.CartDao;
import com.sena.compupro.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
//@CrossOrigin(origins = "http://192.168.1.142:3000")
@CrossOrigin(origins = {"http://192.168.1.142:3000", "http://localhost:3000"})
public class CartController {

    @Autowired
    CartDao cartDao;

    @RequestMapping(value = "api/addCart", method = RequestMethod.POST)
    public void addToCart(@RequestBody Product product){
        cartDao.addToCart(product);
    }

}
