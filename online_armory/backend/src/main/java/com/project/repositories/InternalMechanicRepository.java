package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.InternalMechanic;

@Repository
public interface InternalMechanicRepository extends CrudRepository<InternalMechanic, Long>{
    
}
