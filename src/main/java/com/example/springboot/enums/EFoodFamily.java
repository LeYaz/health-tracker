package com.example.springboot.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EFoodFamily {
    VIANDES("VIANDES"),
    FECULENTS("FECULENTS"),
    FRUITS("FRUITS"),
    LEGUMES("LEGUMES");
    private final String code;
}
