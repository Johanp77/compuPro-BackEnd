package com.sena.compupro.dao;

import com.sena.compupro.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void delete(Long userID);

    void register(User user);

    User obtainUserByCredentials(User user);
}
