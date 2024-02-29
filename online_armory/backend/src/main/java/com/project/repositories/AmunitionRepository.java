package com.project.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Ammunition;

public interface AmunitionRepository extends CrudRepository<Ammunition, Long> {

    
}