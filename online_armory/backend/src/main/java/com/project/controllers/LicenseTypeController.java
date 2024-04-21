package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.LicenseType;
import com.project.services.LicenseTypeService;

@CrossOrigin
@RestController
public class LicenseTypeController {

    @Autowired
    private LicenseTypeService licenseTypeService;

    /* Read - Get all */

    @GetMapping("/licenseTypes")
    public Iterable<LicenseType> getLicenseTypes(){
        return licenseTypeService.getLicenseTypes();
    }

    /* Read - Get one if it exist */

    @GetMapping("/licenseType/{id}")
    public LicenseType getLicenseType(@PathVariable("id") final Long id){
        Optional<LicenseType> licenseType =  licenseTypeService.getLicenseType(id);
        if(licenseType.isPresent()){
            return licenseType.get();
        }else{
            return null;
        }
    } 

    /* Create - Create one */

    @PostMapping("/licenseType")
    public LicenseType createLicenseType(@RequestBody LicenseType licenseType){
        return licenseTypeService.saveLicenseType(licenseType);
    }

    /* Update - Update an existing one */

    @PutMapping("/licenseType/{id}")
    public LicenseType updateLicenseType(@PathVariable("id") final Long id, @RequestBody LicenseType licenseType){
        Optional<LicenseType> a = licenseTypeService.getLicenseType(id);
        if(a.isPresent()){
            LicenseType currentLicenseType = a.get();

            String name = licenseType.getName();
            if(name != null){
                currentLicenseType.setName(name);
            }

            String description = licenseType.getDescription();
            if(description != null){
                currentLicenseType.setDescription(description);
            }

            licenseTypeService.saveLicenseType(currentLicenseType);
            return currentLicenseType;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/licenseType/{id}")
    public void deleteLicenseType(@PathVariable("id") final Long id){
        licenseTypeService.deleteLicenseType(id);
    }
}
