package com.example.springboot.services;

import com.example.springboot.beans.User;
import com.example.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class ServiceUser implements IServiceUser {
    private UserRepository userRepository;

    @Autowired
    public ServiceUser(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
