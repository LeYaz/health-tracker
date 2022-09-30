package com.example.springboot.dao;

import com.example.springboot.beans.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaoFood extends JpaRepository<Food, Integer> {
}
