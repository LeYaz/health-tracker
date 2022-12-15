package com.example.springboot.services;

import com.example.springboot.beans.Food;
import com.example.springboot.repository.FoodRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.NoSuchElementException;

@Service()
public class ServiceFood implements IServiceFood{

    private final FoodRepository repository;

    public ServiceFood(FoodRepository foodRepository){
        this.repository = foodRepository;
    }


    public List<Food> getFoodByReceipe(long receipe_id){
            return repository.findAll();
    }

    public Food getFoodById(long id) {
        return this.repository.findById(id).orElseThrow(() -> new NoSuchElementException("No entity found for " + id));
    }

    public Food createFood(Food pfood) {
        return this.repository.saveAndFlush(pfood);
    }

    public Food updateFood(Food pfood) {
        return this.repository.saveAndFlush(pfood);
    }

    public void deleteFood(long id) {
        this.repository.deleteById(id);
    }
}
