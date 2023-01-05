package com.example.springboot.dto.light;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@NoArgsConstructor
@Getter
@Setter
public class LightUserDto {
    private String email;
    private String password;
}
