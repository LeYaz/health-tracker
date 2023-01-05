package com.example.springboot.services;

import com.example.springboot.beans.Meal;
import com.example.springboot.repository.ReceipeRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service()
public class ServiceReceipe implements IServiceReceipe{

    private ReceipeRepository repository;
    public ServiceReceipe(ReceipeRepository receipeRepository){
        this.repository = receipeRepository;
    }

    public List<Meal> getReceipes() {

        return this.repository.findAll();
    }


    public Meal geReceipeById(long id) {

        return this.repository.findById(id).get();
    }


    public void addReceipe(Meal preceipe) {
        this.repository.saveAndFlush(preceipe);
    }

    public void updateReceipe(Meal preceipe) {
        this.repository.saveAndFlush(preceipe);
    }

    public void deleteReceipe(long id) {
        this.repository.deleteById(id);
    }


    public List<Meal> getReceipeFavorite() {
        return null;
    }


    public List<Meal> getReceipeByDate(Date dateStart, Date dateEnd) {
        return null;
    }
}
