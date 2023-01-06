package com.example.springboot.controllers;

import com.example.springboot.beans.User;
import com.example.springboot.services.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")

public class UserController {

    private final ServiceUser serviceUser;

    public UserController(ServiceUser serviceUser){
        this.serviceUser = serviceUser;
    }

    @PostMapping
    public void registerNewUser(@RequestBody User user){
        serviceUser.createUser(user);
    }

}