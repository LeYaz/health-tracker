package com.example.springboot.controllers;

import com.example.springboot.beans.Receipe;
import com.example.springboot.services.ServiceReceipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/receipes" )
public class ReceipeController {
    private ServiceReceipe serviceReceipe;


    public ReceipeController(ServiceReceipe serviceReceipe){
        this.serviceReceipe = serviceReceipe;
    }
    @GetMapping
    public List<Receipe> getReceipes( ){
        return serviceReceipe.getReceipes();
    }

}
