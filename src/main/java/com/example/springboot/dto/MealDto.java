package com.example.springboot.dto;

import com.example.springboot.enums.EReceipeCategory;
import com.example.springboot.enums.EReceipeType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link com.example.springboot.beans.Meal} entity
 */
@Data
public class MealDto implements Serializable {
    private final Long id;
    private final String label;
    private final Date date;
    private final EReceipeType type;
    private final EReceipeCategory category;
    private final Boolean is_favorite;
    private final FoodDto food;
}