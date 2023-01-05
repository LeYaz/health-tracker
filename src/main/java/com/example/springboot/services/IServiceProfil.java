package com.example.springboot.services;

import com.example.springboot.beans.Profil;
import com.example.springboot.dto.light.LightProfilDto;

public interface IServiceProfil {
    public Profil getProfil(final long id);
    public Profil addProfil(final Profil pprofil);
    public Profil updateProfil(long id, final LightProfilDto lightProfilDto);
    public void deleteProfil(final long id);
}
