package com.example.springboot.services;

import com.example.springboot.beans.Receipe;
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

    public List<Receipe> getReceipes() {

        return this.repository.findAll();
    }


    public Receipe geReceipeById(long id) {

        return this.repository.findById(id).get();
    }


    public void addReceipe(Receipe preceipe) {
        this.repository.saveAndFlush(preceipe);
    }

    public void updateReceipe(Receipe preceipe) {
        this.repository.saveAndFlush(preceipe);
    }

    public void deleteReceipe(long id) {
        this.repository.deleteById(id);
    }


    public List<Receipe> getReceipeFavorite() {
        return null;
    }


    public List<Receipe> getReceipeByDate(Date dateStart, Date dateEnd) {
        return null;
    }
}
