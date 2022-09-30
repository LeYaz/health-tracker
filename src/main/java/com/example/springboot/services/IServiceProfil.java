package com.example.springboot.services;

import com.example.springboot.beans.Profil;

public interface IServiceProfil {
    public Profil getProfil(final long id);
    public void addProfil(final Profil pprofil);
    public void updateProfil(final Profil pprofil);
    public void deleteProfil(final long id);
}
