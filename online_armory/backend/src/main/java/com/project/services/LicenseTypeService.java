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

    /* Read - Get one if it exist */

    public Optional<LicenseType> getLicenseType(final Long id){
        return licenseTypeRepository.findById(id);
    }

    /* Read - Get all */

    public Iterable<LicenseType> getLicenseTypes(){
        return licenseTypeRepository.findAll();
    }

    /* Delete - Delete one */

    public void deleteLicenseType(final Long id){
        licenseTypeRepository.deleteById(id);
    }

    /* Create || Save - Create || Save one */

    public LicenseType saveLicenseType(LicenseType licenseType){
        LicenseType saveLicenseType = licenseTypeRepository.save(licenseType);
        return saveLicenseType;
    }
}
