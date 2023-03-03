package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.AddPackage;

public interface PackageRepository extends JpaRepository<AddPackage, Integer>
{

	
}
