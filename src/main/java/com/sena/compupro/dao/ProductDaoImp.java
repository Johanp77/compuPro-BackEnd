package com.sena.compupro.dao;


import com.sena.compupro.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ProductDaoImp implements  ProductDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    @Transactional
    public List<Product> getProducts(){
        String query = "FROM Product";
        return entityManager.createQuery(query).getResultList();
    }


}
