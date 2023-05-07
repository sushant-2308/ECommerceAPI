package com.geekster.ECommerceAPI.controller;


import com.geekster.ECommerceAPI.model.User;
import com.geekster.ECommerceAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping(value = "/getUserById/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @PostMapping(value = "/addUser")
    public String addUserData(@RequestBody List<User> user){
        return userService.addUser(user);
    }
}
