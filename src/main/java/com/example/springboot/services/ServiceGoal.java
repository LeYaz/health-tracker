package com.example.springboot.services;

import com.example.springboot.beans.Goal;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ServiceGoal implements IServiceGoal {

    @Transactional()
    @Override
    public Goal getGoalById(long id) {
        return null;
    }

    @Transactional()
    @Override
    public Goal getGoalByProfilId(long id) {
        return null;
    }

    @Transactional()
    @Override
    public void addGoal(Goal pgoal) {

    }

    @Transactional()
    @Override
    public void updateGoal(Goal pgoal) {

    }

    @Transactional()
    @Override
    public void deleteGoal(long id) {

    }
}
