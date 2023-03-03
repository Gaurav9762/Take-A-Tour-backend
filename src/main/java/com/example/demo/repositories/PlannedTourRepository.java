package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.PlannedTour;

public interface PlannedTourRepository extends JpaRepository<PlannedTour, Integer> 
{
	

}
