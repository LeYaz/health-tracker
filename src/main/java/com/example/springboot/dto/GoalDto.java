package com.example.springboot.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.springboot.beans.Goal} entity
 */
@Data
public class GoalDto implements Serializable {
    private final Long id;
    private final Integer actual_weight;
    private final Integer goal_weight;
    private final Integer start_weight;
}