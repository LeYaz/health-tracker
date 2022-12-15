package com.example.springboot.repository;

import com.example.springboot.beans.Food;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
}