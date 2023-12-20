package com.example.demospring.service;

import com.example.demospring.entty.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(int id);

    void saveUser(User user);

    void deleteUser(int id);


}
