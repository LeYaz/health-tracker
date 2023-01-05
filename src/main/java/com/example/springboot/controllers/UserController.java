package com.example.springboot.controllers;

import com.example.springboot.beans.User;
import com.example.springboot.repository.UserRepository;
import com.example.springboot.services.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")

public class UserController {

    private ServiceUser serviceUser;
    private User user;

    @Autowired
    public UserController(ServiceUser serviceUser, User user){
        this.serviceUser = serviceUser;
        this.user = user;
    }

    @GetMapping
    public List<User> getUsers(){
        return serviceUser.getUsers();
    }

    @PostMapping
    public void registerNewUser(@RequestBody User user){
        serviceUser.createUser(user);
    }

}
