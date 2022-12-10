package com.sena.compupro.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "products")
@ToString @EqualsAndHashCode
//@Embeddable
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id_product")
    private String id_product;

    @Getter @Setter @Column(name = "name_product")
    private String name_product;

    @Getter @Setter @Column(name = "type_product")
    private String type_product;

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





//    @Getter @Setter
//    @ManyToOne
//    private Product product;

//    @Getter @Setter
//    @ManyToOne
//    private Cart cart;

//    @Getter @Setter
//    @ManyToOne
//    private User user;


}
