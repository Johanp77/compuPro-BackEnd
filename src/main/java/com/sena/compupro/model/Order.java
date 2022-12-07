package com.sena.compupro.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name= "orders")
@ToString
@EqualsAndHashCode
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name= "order_id" )
    private String orderID;

    @Getter @Setter @Column(name= "order_status")
    private String status;

    @Getter @Setter
    @ManyToOne
    private User user;

//    @Getter @Setter
//    @OneToOne(mappedBy = "order")
//    private DetailOrder detailOrder;

}
