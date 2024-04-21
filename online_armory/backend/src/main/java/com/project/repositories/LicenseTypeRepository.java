package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.LicenseType;

@Repository
public interface LicenseTypeRepository extends CrudRepository<LicenseType, Long> {
    
}
