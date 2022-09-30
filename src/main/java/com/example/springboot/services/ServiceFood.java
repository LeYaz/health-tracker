package com.example.springboot.services;

import com.example.springboot.beans.Food;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class ServiceFood implements IServiceFood{
    @Override
    public List<Food> getFoodByReceipe(long receipe_id) {
        return null;
    }

    @Override
    public Food getFoodById(long id) {
        return null;
    }

    @Override
    public void createFood(Food pfood) {

    }

    @Override
    public void updateFood(Food pfood) {

    }

    @Override
    public void deleteFood(long id) {

    }
}
