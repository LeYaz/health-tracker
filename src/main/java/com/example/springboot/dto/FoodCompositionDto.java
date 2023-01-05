package com.example.springboot.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.springboot.beans.FoodComposition} entity
 */
@Data
public class FoodCompositionDto implements Serializable {
    private final Long id;
    private final Integer glucides;
    private final Integer lipides;
    private final Integer proteins;
    private final Integer sugar;
}