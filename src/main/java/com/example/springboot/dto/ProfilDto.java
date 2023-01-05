package com.example.springboot.dto;

import com.example.springboot.beans.Profil;
import com.example.springboot.dto.GoalDto;
import com.example.springboot.dto.MealDto;
import com.example.springboot.dto.MonitoringDto;
import com.example.springboot.dto.UserDto;
import com.example.springboot.enums.EFoodPreference;
import com.example.springboot.enums.EUserSexe;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link Profil} entity
 */
@Data
public class ProfilDto implements Serializable {
    private final Long id;
    private final String name;
    private final String surname;
    private final Integer height;
    private final EUserSexe sexe;
    private final Date created_at;
    private final Date birth;
    private final Integer weight;
    private final EFoodPreference food_preference;
    private final UserDto user_id;
    private final MonitoringDto monitoring;
    private final MealDto meal;
    private final GoalDto goal;
}