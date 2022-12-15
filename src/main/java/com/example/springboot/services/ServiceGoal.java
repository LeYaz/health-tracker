package com.example.springboot.services;

import com.example.springboot.beans.Goal;
import com.example.springboot.repository.GoalRepository;
import org.springframework.stereotype.Service;


@Service
public class ServiceGoal implements IServiceGoal {

    private GoalRepository repository;

    public ServiceGoal(GoalRepository goalRepository){
        this.repository = goalRepository;
    }

    public Goal getGoalById(long id) {

        return this.repository.findById(id).get();
    }


    public Goal getGoalByProfilId(long id) {
        return null;
    }


    public Goal addGoal(Goal pgoal) {
        return this.repository.saveAndFlush(pgoal);
    }


    public Goal updateGoal(Goal pgoal) {
        return this.repository.saveAndFlush(pgoal);
    }


    public void deleteGoal(long id) {
        this.repository.deleteById(id);
        return;
    }
}
