package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.License;
import com.project.models.Member;
import com.project.services.LicenseService;

@CrossOrigin
@RestController
public class LicenseController {

    @Autowired
    private LicenseService licenseService;

    @GetMapping("/licenses")
    public Iterable<License> getLicenses(){
        return licenseService.getLicenses();
    }

        @GetMapping("/license/{licenseId}")
        public Optional<License> getLicense(@PathVariable Long licenseId){
            return licenseService.getLicense(licenseId);
    }
    
}
