package com.example.springboot.services;

import com.example.springboot.beans.FoodComposition;

import java.util.List;

public interface IServiceFoodComposition {
    public FoodComposition getFoodCompositionById(final long id);
    public List<FoodComposition> getFoodCompositionByFoodId(final long id);
    public void addFoodComposition(final FoodComposition ffoodcomposition);
    public void updateFoodComposition(final FoodComposition ffoodcomposition);
    public void deleteFoodComposition(final long id);
}
