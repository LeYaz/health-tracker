package com.example.springboot.services;

import com.example.springboot.beans.User;
import com.example.springboot.dto.light.LightUserDto;

public interface IServiceUser {
    public User addUser(final User user);
    public User getUserById(final long id);
    public User updateUser(Long id, LightUserDto dto);
    public void deleteUser(final long id);

}
