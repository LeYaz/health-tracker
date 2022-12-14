package com.example.springboot.services;

import com.example.springboot.beans.Food;

import java.util.List;

public interface IServiceFood {
    public List<Food> getFoodByReceipe(final long receipe_id);
    public Food getFoodById(final long id);
    public Food createFood(final Food pfood);
    public Food updateFood(final Food pfood);
    public void deleteFood(final long id);

}
