package com.example.springboot.controllers;


import com.example.springboot.services.ServiceProfil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/profil" )
public class ProfilController {
    private ServiceProfil serviceProfil;
    public ProfilController(ServiceProfil serviceProfil){
        this.serviceProfil = serviceProfil;
    }
}
