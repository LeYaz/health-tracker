package com.example.springboot.services;

import com.example.springboot.beans.Goal;

public interface IServiceGoal {
    public Goal getGoalById(final long id);
    public Goal getGoalByProfilId(final long id);
    public Goal addGoal(final Goal pgoal);
    public Goal updateGoal(final Goal pgoal);
    public void deleteGoal(final long id);
}
