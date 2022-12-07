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
    @Getter @Setter @Column(name = "userID")
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


    @Getter @Setter
    @OneToMany(mappedBy = "user")
    private List<Order> orders;


    @OneToMany(mappedBy = "user")
    @Getter @Setter
    private List<Product> products;

//    public Long getUserID() {
//        return userID;
//    }
//
//    public void setUserID(Long userID) {
//        this.userID = userID;
//    }
//
//    public String getUser_name() {
//        return user_name;
//    }
//
//    public void setUser_name(String user_name) {
//        this.user_name = user_name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getCreate_time() {
//        return create_time;
//    }
//
//    public void setCreate_time(String create_time) {
//        this.create_time = create_time;
//    }
//
//    public String getClientAdress() {
//        return clientAdress;
//    }
//
//    public void setClientAdress(String clientAdress) {
//        this.clientAdress = clientAdress;
//    }
//
//    public String getClientPhone() {
//        return clientPhone;
//    }
//
//    public void setClientPhone(String clientPhone) {
//        this.clientPhone = clientPhone;
//    }
}
