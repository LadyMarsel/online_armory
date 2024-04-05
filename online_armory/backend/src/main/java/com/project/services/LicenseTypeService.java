package com.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.LicenseType;
import com.project.repositories.LicenseTypeRepository;

@Service
public class LicenseTypeService {
    
    @Autowired
    private LicenseTypeRepository licenseTypeRepository;

    public Optional<LicenseType> getLicenseType(final Long id){
        return licenseTypeRepository.findById(id);
    }

    public Iterable<LicenseType> getLicenseTypes(){
        return licenseTypeRepository.findAll();
    }
    
}
