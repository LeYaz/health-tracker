package com.example.springboot.repository;

import com.example.springboot.beans.FoodComposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodCompositionRepository extends JpaRepository<FoodComposition, Long> {
}