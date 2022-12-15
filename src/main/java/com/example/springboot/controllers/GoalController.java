package com.example.springboot.controllers;

import com.example.springboot.services.ServiceGoal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/goal" )
public class GoalController {

    private final ServiceGoal serviceGoal;

    public GoalController(ServiceGoal serviceGoal){
       this.serviceGoal = serviceGoal;
    }
}
