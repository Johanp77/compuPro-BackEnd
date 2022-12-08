package com.sena.compupro.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name= "users")
@ToString @EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "user_id")
    private Long userID;

//    @ManyToMany
//    @JoinTable(name = "users_tipe",
//    joinColumns = @JoinColumn(name="userID"),
//    inverseJoinColumns = @JoinColumn(name="role_id"))
//    private Set<Rol> roles;

    @Getter @Setter @Column(name = "user_name")
    private String user_name;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "password")
    private String password;

    @Getter @Setter @Column(name = "create_time")
    private String create_time;

    @Getter @Setter @Column(name = "client_address")
    private String client_address;

    @Getter @Setter @Column(name = "client_phone")
    private String client_phone;


    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "userCart")
    @Getter @Setter
    public List<Cart> userCart;
//    @Getter @Setter
//    @OneToMany(mappedBy = "user")
//    private List<Order> orders;


//    @OneToMany(mappedBy = "user")
//    @Getter @Setter
//    private List<Product> products;

}
