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
}
