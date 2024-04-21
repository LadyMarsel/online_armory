package com.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.License;
import com.project.repositories.LicenseRepository;

@Service
public class LicenseService {

    @Autowired
    private LicenseRepository licenseRepository;

    /* Read - Get one if it exist */
    
    public Optional<License> getLicense(final Long id){
        return licenseRepository.findById(id);
    }

    /* Read - Get all */

    public Iterable<License> getLicenses(){
        return licenseRepository.findAll();
    }

    /* Delete - Delete one */

    public void deleteLicense(final Long id){
        licenseRepository.deleteById(id);
    }

    /* Create || Save - Create || Save one */

    public License saveLicense(License license){
        License savedLicense = licenseRepository.save(license);
        return savedLicense;
    }
    
}
