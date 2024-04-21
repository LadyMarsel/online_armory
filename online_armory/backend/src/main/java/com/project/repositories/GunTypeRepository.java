package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.GunType;

@Repository
public interface GunTypeRepository extends CrudRepository<GunType, Long> {
    
}
