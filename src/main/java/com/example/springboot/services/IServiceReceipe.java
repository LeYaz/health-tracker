package com.example.springboot.services;

import com.example.springboot.beans.Meal;

import java.util.Date;
import java.util.List;

public interface IServiceReceipe {
    public List<Meal> getReceipes();
    public Meal geReceipeById(final long id);
    public void addReceipe(final Meal preceipe);
    public void updateReceipe(final Meal preceipe);
    public void deleteReceipe(final long id);
    public List<Meal> getReceipeFavorite();
    public List<Meal> getReceipeByDate(Date dateStart, Date dateEnd);

}
