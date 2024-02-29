package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.Ammunition;

@Repository
public interface AmmunitionRepository extends CrudRepository<Ammunition, Long> {

    
}