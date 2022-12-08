package com.sena.compupro.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
//@Table()
@ToString @EqualsAndHashCode

public class DetailOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column()
    private String detail_id;

//    @Getter @Setter
//    @OneToOne
//    private Order order;

    @Getter @Setter
    @OneToOne
    private Product product;
}
