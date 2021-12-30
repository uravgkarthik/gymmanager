package com.gymmanager.service;

import com.gymmanager.models.Gym;
import com.gymmanager.repo.GymDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GymService {

    @Autowired
    GymDAO repo;

    public List<Gym> getData(){
        return repo.findAll();
    }

    public Optional<Gym> getDataById(int id){
        return repo.findById(id);
    }

    public void putData(Gym gym){
        repo.save(gym);
    }
}
