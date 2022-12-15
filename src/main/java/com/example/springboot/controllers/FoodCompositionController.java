package com.example.springboot.controllers;

import com.example.springboot.services.ServiceFoodComposition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/food-composition" )
public class FoodCompositionController {

    private final ServiceFoodComposition serviceFoodComposition;
    //test

    public FoodCompositionController(ServiceFoodComposition service){
        this.serviceFoodComposition =service;
    }
}
