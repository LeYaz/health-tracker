package com.example.springboot.controllers;


import com.example.springboot.beans.Profil;
import com.example.springboot.services.ServiceProfil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/profil" )
public class ProfilController {
    private ServiceProfil serviceProfil;
    public ProfilController(ServiceProfil serviceProfil){
        this.serviceProfil = serviceProfil;
    }

    public void getUserDetail(@RequestBody Profil profil){

    }
}
