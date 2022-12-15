package com.example.springboot.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.springboot.beans.User} entity
 */
@Data
public class UserDto implements Serializable {
    private final Long id;
    private final String email;
    private final String password;
}