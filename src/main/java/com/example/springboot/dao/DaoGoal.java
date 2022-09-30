package com.example.springboot.dao;

import com.example.springboot.beans.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaoGoal extends JpaRepository<Goal, Integer> {
}
