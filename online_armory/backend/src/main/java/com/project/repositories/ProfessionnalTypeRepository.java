package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.ProfessionnalType;

@Repository
public interface ProfessionnalTypeRepository extends CrudRepository<ProfessionnalType, Long>{
    
}
