package com.gymmanager.controller;

import com.gymmanager.models.Gym;
import com.gymmanager.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GymController {

    @Autowired
    GymService gymService;

    @GetMapping("/")
    public List<Gym> getData(){
    return gymService.getData();
    }

    @GetMapping("/{id}")
    public Gym getDataById(@PathVariable int id){
    Optional gym = gymService.getDataById(id);

    if(gym.isPresent()){
        return (Gym) gym.get();
    }
    return null;
    }

    @PostMapping("/add")
    public void putData(@RequestBody Gym gym){
    gymService.putData();

    }
}
