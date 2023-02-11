package com.crud.services;

import com.crud.entities.User;

import java.util.List;

public interface UserService {
    User  addUser(User user);
    User updateUser(User user,Integer userId);
    void deleteUser(Integer userId);
    List<User> getALlUsers();
    User getSingleUser(Integer userId);
}
