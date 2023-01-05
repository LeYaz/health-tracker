package com.example.springboot.controllers;


import com.example.springboot.beans.Profil;
import com.example.springboot.dto.ProfilDto;
import com.example.springboot.dto.light.LightProfilDto;
import com.example.springboot.mappers.ProfilMapper;
import com.example.springboot.services.ServiceProfil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(path = "/profil" )
public class ProfilController {
    private final ServiceProfil serviceProfil;
    public ProfilController(ServiceProfil serviceProfil){
        this.serviceProfil = serviceProfil;
    }

    @PostMapping(value = "")
    public ResponseEntity<ProfilDto> create(@RequestBody LightProfilDto dto){
        Profil profil = ProfilMapper.INSTANCE.toBo(dto);
        profil = this.serviceProfil.addProfil(profil);
        ProfilDto profilDto = ProfilMapper.INSTANCE.toDto(profil);
        return ResponseEntity.ok(profilDto);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProfilDto> findById(@PathVariable("id") long id){
        Profil profil = this.serviceProfil.getProfil(id);
        ProfilDto dto = ProfilMapper.INSTANCE.toDto(profil);
        return ResponseEntity.ok(dto);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<ProfilDto> updateProfil(@PathVariable("id") long id, @RequestBody LightProfilDto lightProfilDto){
        Profil update = this.serviceProfil.updateProfil(id, lightProfilDto);
        ProfilDto profilDto = ProfilMapper.INSTANCE.toDto(update);
        return ResponseEntity.ok(profilDto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteProfil(@PathVariable("id") long id){
        this.serviceProfil.deleteProfil(id);
        return ResponseEntity.noContent().build();
    }
}
