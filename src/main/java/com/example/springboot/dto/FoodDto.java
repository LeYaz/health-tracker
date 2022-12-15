package com.example.springboot.dto;

import com.example.springboot.enums.EFoodFamily;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.springboot.beans.Food} entity
 */
@Data
public class FoodDto implements Serializable {
    private final Long id;
    private final String name;
    private final Integer weight;
    private final Integer calorie;
    private final Integer quantity;
    private final EFoodFamily family;
}