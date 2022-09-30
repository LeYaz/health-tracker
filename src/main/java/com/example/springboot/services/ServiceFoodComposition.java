package com.example.springboot.services;

import com.example.springboot.beans.FoodComposition;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class ServiceFoodComposition implements IServiceFoodComposition{
    @Override
    public FoodComposition getFoodCompositionById(long id) {
        return null;
    }

    @Override
    public List<FoodComposition> getFoodCompositionByFoodId(long id) {
        return null;
    }

    @Override
    public void addFoodComposition(FoodComposition ffoodcomposition) {

    }

    @Override
    public void updateFoodComposition(FoodComposition ffoodcomposition) {

    }

    @Override
    public void deleteFoodComposition(long id) {

    }
}
