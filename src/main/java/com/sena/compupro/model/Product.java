package com.sena.compupro.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name= "products")
@ToString @EqualsAndHashCode
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idProduct")
    private Long productID;

    @Getter @Setter @Column(name = "name_product")
    private String name_product;

    @Getter @Setter @Column(name = "price_product")
    private String price_product;

    @Getter @Setter @Column(name = "description_product")
    private String description_product;

    @Getter @Setter @Column(name = "image_product")
    private String image_product;

    @Getter @Setter @Column(name = "image_product2")
    private String image_product2;

    @Getter @Setter @Column(name = "image_product3")
    private String image_product3;


}
