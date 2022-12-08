package com.sena.compupro.controller;


import com.sena.compupro.dao.ProductDao;
import com.sena.compupro.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://192.168.1.142:3000")
@CrossOrigin(origins = {"http://192.168.1.142:3000", "http://localhost:3000"})
public class ProductController {

    @Autowired
    ProductDao productDao;


    @RequestMapping(value= "api/products", method = RequestMethod.GET)
    public List<Product> getProducts(){
        return productDao.getProducts();
    }



}
