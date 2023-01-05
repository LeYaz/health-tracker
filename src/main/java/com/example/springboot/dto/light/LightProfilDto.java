package com.example.springboot.dto.light;

import com.example.springboot.enums.EFoodPreference;
import com.example.springboot.enums.EUserSexe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class LightProfilDto {
    private String name;
    private String surname;
    private Integer height;
    private EUserSexe sexe;
    private Date birth;
    private Integer weight;
    private EFoodPreference food_preference;
}
