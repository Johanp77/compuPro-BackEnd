package com.sena.compupro.dao;


import com.sena.compupro.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

}
