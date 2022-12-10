package com.sena.compupro.dao;

import com.sena.compupro.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();

//    List<Product> getProductByType(String type_product);
    List<Product> getProductById(Product product);


}
