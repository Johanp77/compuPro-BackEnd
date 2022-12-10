package com.sena.compupro.dao;

import com.sena.compupro.model.Cart;
import com.sena.compupro.model.Product;

import java.util.List;

public interface CartDao {

    void addToCart(Product product);

//    List<Cart> findCartByClientId(String user_id);


//    void deleteProductById(String user_id);

//    void deleteAllById(String user_id);

//    Long countByClientId(String id);

}
