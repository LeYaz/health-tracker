package com.example.springboot.services;

import com.example.springboot.beans.Profil;
import org.springframework.stereotype.Service;

@Service()
public class ServiceProfil implements IServiceProfil{
    @Override
    public Profil getProfil(long id) {
        return null;
    }

    @Override
    public void addProfil(Profil pprofil) {

    }

    @Override
    public void updateProfil(Profil pprofil) {

    }

    @Override
    public void deleteProfil(long id) {

    }
}
