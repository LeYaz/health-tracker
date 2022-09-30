package com.example.springboot.services;

import com.example.springboot.beans.Receipe;

import java.util.Date;
import java.util.List;

public interface IServiceReceipe {
    public List<Receipe> getReceipes();
    public Receipe geReceipeById(final long id);
    public void addReceipe(final Receipe preceipe);
    public void updateReceipe(final Receipe preceipe);
    public void deleteReceipe(final long id);
    public List<Receipe> getReceipeFavorite();
    public List<Receipe> getReceipeByDate(Date dateStart, Date dateEnd);

}
