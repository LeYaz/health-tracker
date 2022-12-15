package com.example.springboot.controllers;

import com.example.springboot.beans.Food;
import com.example.springboot.dto.FoodDto;
import com.example.springboot.services.ServiceFood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping(path = "/foods" )
public class FoodController {


    public final ServiceFood serviceFood;

    public FoodController(ServiceFood serviceFood){
        this.serviceFood = serviceFood;
    }

    @GetMapping()
    public List<Food> index(){
        return serviceFood.getFoodByReceipe(1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Food> findOne(@PathVariable("id") Long id){
        Food food = this.serviceFood.getFoodById(id);
        return ResponseEntity.ok(food);
    }
}
