package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.License;
import com.project.services.LicenseService;

@RestController
public class LicenseController {

    @Autowired
    private LicenseService licenseService;

    @GetMapping("/licenses")
    public Iterable<License> getLicenses(){
        return licenseService.getLicenses();
    }
    
}
