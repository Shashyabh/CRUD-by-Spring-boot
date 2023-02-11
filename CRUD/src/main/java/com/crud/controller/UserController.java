package com.crud.controller;

import com.crud.entities.User;
import com.crud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

    @PutMapping("/update/{userId}")
    public User updateuser(@RequestBody User user, @PathVariable Integer userId){
        return this.userService.updateUser(user,userId);
    }

    @GetMapping("/getAll")
    public List<User> getALLUser(){
        return this.userService.getALlUsers();
    }

    @GetMapping("/getById/{userId}")
    public User getSingle(@PathVariable Integer userId){
        return this.userService.getSingleUser(userId);
    }

    @DeleteMapping("/delete/{userId}")
    public void deleteUser(@PathVariable Integer userId){
        this.userService.deleteUser(userId);
    }
}
