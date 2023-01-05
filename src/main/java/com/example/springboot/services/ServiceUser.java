package com.example.springboot.services;

import com.example.springboot.beans.User;
import com.example.springboot.dto.light.LightUserDto;
import com.example.springboot.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service()
public class ServiceUser implements IServiceUser {
    private final UserRepository userRepository;
    public ServiceUser(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User addUser(User user) {
        return this.userRepository.saveAndFlush(user);
    }

    @Override
    public User getUserById(long id) {
        return this.userRepository.findById(id).get();
    }

    @Override
    public User updateUser(Long id, LightUserDto dto) {
        User user = this.getUserById(id);
        user.update(dto);
        return this.userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteUser(long id) {
        this.userRepository.deleteById(id);
    }
}
