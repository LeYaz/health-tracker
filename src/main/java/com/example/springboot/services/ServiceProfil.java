package com.example.springboot.services;

import com.example.springboot.beans.Profil;
import com.example.springboot.repository.ProfilRepository;
import org.springframework.stereotype.Service;

@Service()
public class ServiceProfil implements IServiceProfil{

    private ProfilRepository repository;
    public ServiceProfil(ProfilRepository profilRepository){
        this.repository = profilRepository;
    }
    public Profil getProfil(long id) {
        return this.repository.findById(id).get();
    }

    public void addProfil(Profil pprofil) {
        this.repository.saveAndFlush(pprofil);
    }

    public void updateProfil(Profil pprofil) {
        this.repository.saveAndFlush(pprofil);
    }

    public void deleteProfil(long id) {
        this.repository.deleteById(id);
    }
}
