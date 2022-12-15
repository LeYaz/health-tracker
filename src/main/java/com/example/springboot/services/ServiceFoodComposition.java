package com.example.springboot.services;

import com.example.springboot.beans.FoodComposition;
import com.example.springboot.repository.FoodCompositionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class ServiceFoodComposition implements IServiceFoodComposition{

    private FoodCompositionRepository repository;

    public ServiceFoodComposition(FoodCompositionRepository repository){
        this.repository = repository;
    }
    public FoodComposition getFoodCompositionById(long id) {

        return repository.findById(id).get();
    }


    public List<FoodComposition> getFoodCompositionByFoodId(long id) {
        return null;
    }


    public FoodComposition addFoodComposition(FoodComposition ffoodcomposition) {
        return this.repository.saveAndFlush(ffoodcomposition);
    }


    public FoodComposition updateFoodComposition(FoodComposition ffoodcomposition) {
        return this.repository.saveAndFlush(ffoodcomposition);
    }


    public void deleteFoodComposition(long id) {
        this.repository.deleteById(id);
    }
}
