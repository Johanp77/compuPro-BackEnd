package com.sena.compupro.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "shopping_cart")
@ToString
@EqualsAndHashCode
public class Cart {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idshopping_cart")
    private String cartID;


//    private User user;

    @ManyToOne
    @Getter @Setter
    @JoinColumn(name = "user_id")
    private User userCart;

    @ManyToOne(cascade = CascadeType.DETACH)
    @Getter @Setter
    private Product product;

    @Getter @Setter @Column(name = "product_quantity")
    private String amount;


//    @Getter @Setter
//    @OneToMany(mappedBy = "cart")
//    private List<Product> products;


//    @Id
//    @Getter @Setter
//    @JoinColumn(name= "id_product")
//    private String idProduct;

//    @Embedded private Product product;


////    @ForeignKey
//    @JoinColumn
//    @OneToMany(cascade = CascadeType.ALL)
////    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
//    @Getter @Setter
////    @JoinColumn(name = "id_product")
////    private String product_id;
//        private List<CartLine> cartLineList;

}
