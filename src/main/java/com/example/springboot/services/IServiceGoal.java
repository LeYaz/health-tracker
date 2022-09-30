package com.example.springboot.services;

import com.example.springboot.beans.Goal;

public interface IServiceGoal {
    public Goal getGoalById(final long id);
    public Goal getGoalByProfilId(final long id);
    public void addGoal(final Goal pgoal);
    public void updateGoal(final Goal pgoal);
    public void deleteGoal(final long id);
}
