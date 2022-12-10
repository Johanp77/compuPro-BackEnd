package com.sena.compupro.controller;
import com.sena.compupro.controller.userController;


import com.sena.compupro.dao.PQRDao;
import com.sena.compupro.model.PQR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = {"http://192.168.1.142:3000", "http://localhost:3000"})
public class PQRController {

    @Autowired
    PQRDao pqrDao;

    userController auth = new userController();


    @RequestMapping(value = "api/newpqr", method = RequestMethod.POST)
    public void newPQR(@RequestBody PQR pqr, @RequestHeader(value = "Authorization") String token ){

//        if(auth.verifyToken(token)){
            pqrDao.newPQR(pqr);
//        }

//        return;

    }

}
