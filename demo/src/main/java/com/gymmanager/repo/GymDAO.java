package com.gymmanager.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gymmanager.models.Gym;

public interface GymDAO extends JpaRepository<Gym, Integer> {
}
