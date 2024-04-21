package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.Caliber;

@Repository
public interface CaliberRepository extends CrudRepository<Caliber, Long> {
    
}
