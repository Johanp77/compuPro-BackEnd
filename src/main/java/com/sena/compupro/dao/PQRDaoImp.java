package com.sena.compupro.dao;


import com.sena.compupro.model.PQR;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class PQRDaoImp implements PQRDao {

    @PersistenceContext
    EntityManager entityManager;


    public void newPQR(PQR pqr){
        entityManager.merge(pqr);
    }

}
