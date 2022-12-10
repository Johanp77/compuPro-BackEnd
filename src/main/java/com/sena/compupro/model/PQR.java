package com.sena.compupro.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "pqr")
@ToString
public class PQR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id_pqr")
    private String id_PQR;


    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "id_client")
    private User clientID;

    @Getter @Setter @Column(name = "title_pqr")
    private String title_pqr;

    @Getter @Setter @Column(name = "body_pqr")
    private String body_pqr;

    @Getter @Setter @Column(name = "type_pqr")
    private String type_pqr;

    @Getter @Setter @Column(name = "date_pqr")
    private String date_pqr;
}
