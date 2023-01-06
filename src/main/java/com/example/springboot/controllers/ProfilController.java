package com.example.springboot.controllers;


import com.example.springboot.beans.Profil;
import com.example.springboot.services.ServiceProfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/profils" )
public class ProfilController {
    private ServiceProfil serviceProfil;

    public ProfilController(ServiceProfil serviceProfil){

        this.serviceProfil = serviceProfil;
    }

    public void getUserDetail(@RequestBody Profil profil){
    }

    @GetMapping
    public List<Profil> getProfils(){
        return serviceProfil.getProfils();
    }
}
