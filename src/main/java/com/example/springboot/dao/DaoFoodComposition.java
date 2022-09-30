package com.example.springboot.dao;

import com.example.springboot.beans.FoodComposition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaoFoodComposition extends JpaRepository<FoodComposition, Integer> {
}
