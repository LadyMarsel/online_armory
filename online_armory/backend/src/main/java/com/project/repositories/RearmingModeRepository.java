package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.RearmingMode;

@Repository
public interface RearmingModeRepository extends CrudRepository<RearmingMode, Long>{
    
}
