package com.example.springboot.dao;

import com.example.springboot.beans.Monitoring;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaoMonitoring extends JpaRepository<Monitoring, Integer> {
}
