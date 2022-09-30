package com.example.springboot.services;

import com.example.springboot.beans.Receipe;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service()
public class ServiceReceipe implements IServiceReceipe{

    @Override
    public List<Receipe> getReceipes() {
        return null;
    }

    @Override
    public Receipe geReceipeById(long id) {
        return null;
    }

    @Override
    public void addReceipe(Receipe preceipe) {

    }

    @Override
    public void updateReceipe(Receipe preceipe) {

    }

    @Override
    public void deleteReceipe(long id) {

    }

    @Override
    public List<Receipe> getReceipeFavorite() {
        return null;
    }

    @Override
    public List<Receipe> getReceipeByDate(Date dateStart, Date dateEnd) {
        return null;
    }
}
