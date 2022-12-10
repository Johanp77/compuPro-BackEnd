package com.sena.compupro.dao;


import com.sena.compupro.model.Product;
import com.sena.compupro.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class ProductDaoImp implements  ProductDao {

    @PersistenceContext
    EntityManager entityManager;

//    @Autowired
//    Product product;

    @Override
    @Transactional
    public List<Product> getProducts(){
        String query = "FROM Product";
        return entityManager.createQuery(query).getResultList();
    }

//    @Override
//    public List<Product> getProductById(String type_product) {
//        return null;
//    }

//    public Optional<Product> getProductById(String id){
//        return entityManager.find(Product.class, id);
//    }

//    @Transactional
//    @Override
//    public List<Product> getProductByType(String type_product){
//        List <Product> producto = Collections.singletonList(entityManager.find(Product.class, type_product));
//        return producto.getResultList();
//    }

    @Transactional
    public List<Product> getProductById(Product product){

//        Product product;


        String query = "FROM Products WHERE type_product= :type_product";
        List <Product> list = entityManager.createQuery(query)
                .setParameter("type_product", product.getType_product() )
                .getResultList();

        if(list.isEmpty()){
            return null;
        }
        return list;
    }

}
