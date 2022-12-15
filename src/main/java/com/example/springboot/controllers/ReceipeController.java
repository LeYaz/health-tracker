package com.example.springboot.controllers;

import com.example.springboot.services.ServiceReceipe;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/receipe" )
public class ReceipeController {
    private ServiceReceipe serviceReceipe;
    public ReceipeController(ServiceReceipe serviceReceipe){
        this.serviceReceipe = serviceReceipe;
    }
}
