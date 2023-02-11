package com.crud.services.Impl;

import com.crud.entities.User;
import com.crud.repositories.UserRepo;
import com.crud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User addUser(User user) {
        return this.userRepo.save(user);
    }

    @Override
    public User updateUser(User user, Integer userId) {
        User user1=this.userRepo.findById(userId).get();
        user1.setName(user.getName());
        user1.setEmail(user.getEmail());
        user1.setAge(user.getAge());
        return this.userRepo.save(user1);
    }

    @Override
    public void deleteUser(Integer userId) {
        this.userRepo.deleteById(userId);

    }

    @Override
    public List<User> getALlUsers() {
        return this.userRepo.findAll();
    }

    @Override
    public User getSingleUser(Integer userId) {
        return this.userRepo.findById(userId).get();
    }
}
