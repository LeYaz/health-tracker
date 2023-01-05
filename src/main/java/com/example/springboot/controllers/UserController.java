package com.example.springboot.controllers;

import com.example.springboot.beans.User;
import com.example.springboot.repository.UserRepository;
import com.example.springboot.services.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")

public class UserController {

    private ServiceUser serviceUser;

    @Autowired
    public UserController(ServiceUser serviceUser){
        this.serviceUser = serviceUser;
    }

    @GetMapping
    public List<User> getUsers(){
        return serviceUser.getUsers();
    }

}
