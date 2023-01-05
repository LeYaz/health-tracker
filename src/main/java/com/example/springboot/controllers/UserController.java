package com.example.springboot.controllers;

import com.example.springboot.beans.User;
import com.example.springboot.dto.UserDto;
import com.example.springboot.dto.light.LightUserDto;
import com.example.springboot.mappers.UserMapper;
import com.example.springboot.services.ServiceUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/user")
public class UserController {

    private final ServiceUser serviceUser;

    public UserController(ServiceUser serviceUser){
        this.serviceUser = serviceUser;
    }

    @PostMapping(value = "")
    public ResponseEntity<UserDto> create(@RequestBody LightUserDto dto){
        User user = UserMapper.INSTANCE.toBo(dto);
        user = this.serviceUser.addUser(user);
        UserDto userDto = UserMapper.INSTANCE.toDto(user);
        return ResponseEntity.ok(userDto);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable("id") Long id){
        User user = this.serviceUser.getUserById(id);
        UserDto dto = UserMapper.INSTANCE.toDto(user);

        return ResponseEntity.ok(dto);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") long id, @RequestBody LightUserDto dto){
        User update = this.serviceUser.updateUser(id, dto);
        UserDto user = UserMapper.INSTANCE.toDto(update);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> removeUser(@PathVariable("id") long id){
        this.serviceUser.deleteUser(id);
        return ResponseEntity.noContent().build();
    }



}
