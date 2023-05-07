package com.geekster.ECommerceAPI.service;

import com.geekster.ECommerceAPI.model.User;
import com.geekster.ECommerceAPI.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).get();
    }


    public String addUser(List<User> user) {
        userRepository.saveAll(user);
        return "user added successfully";
    }
}
