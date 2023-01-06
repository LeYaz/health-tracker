package com.example.springboot.services;

import com.example.springboot.beans.User;
import com.example.springboot.repository.ReceipeRepository;
import com.example.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service()
public class ServiceUser implements IServiceUser {
    private UserRepository userRepository;

    public ServiceUser(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void createUser(User user){
        Optional <User> userOptional = userRepository.findUserByEmail(user.getEmail());

        if (userOptional.isPresent()){
            throw new IllegalStateException("This email is already taken");
        }

        userRepository.save(user);
    }
}
