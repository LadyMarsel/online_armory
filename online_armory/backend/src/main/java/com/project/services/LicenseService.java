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

    public Optional<License> getLicense(final Long id){
        return licenseRepository.findById(id);
    }

    public Iterable<License> getLicenses(){
        return licenseRepository.findAll();
    }

    public void deleteLicense(final Long id){
        licenseRepository.deleteById(id);
    }

    public License saveLicense(License license){
        License savedLicense = licenseRepository.save(license);
        return savedLicense;
    }
    
}
