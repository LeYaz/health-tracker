package com.example.springboot.dao;

import com.example.springboot.beans.Profil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaoProfil extends JpaRepository<Profil, Integer> {
}
