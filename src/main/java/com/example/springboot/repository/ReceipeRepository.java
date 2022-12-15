package com.example.springboot.repository;

import com.example.springboot.beans.Receipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceipeRepository extends JpaRepository<Receipe, Long> {
}