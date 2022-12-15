package com.example.springboot.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EUserSexe {
    MAN("MAN"),
    WOMAN("WOMAN"),
    UNKNOW("UNKNOW");
    private final String code;
}
