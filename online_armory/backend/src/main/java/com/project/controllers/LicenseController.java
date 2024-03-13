package com.project.controllers;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.License;
import com.project.models.LicenseType;
import com.project.models.Member;
import com.project.services.LicenseService;


@CrossOrigin
@RestController
public class LicenseController {

   @Autowired
    private LicenseService licenseService;

    /* Read - Get all */

    @GetMapping("/licenses")
    public Iterable<License> getLicenses(){
        return licenseService.getLicenses();
    }

    /* Read - Get one if it exist */

    @GetMapping("/license/{id}")
    public License getLicense(@PathVariable("id") final Long id){
        Optional<License> license = licenseService.getLicense(id);
        if(license.isPresent()){
            return license.get();
        }else{
            return null;
        }
    }

    /* Create - Create one */
    
    @PostMapping("/license")
    public License createLicense(@RequestBody License license){
        return licenseService.saveLicense(license);
    }

    /* Update - Update an existing one */

    @PutMapping("/license/{id}")
    public License updateLicense(@PathVariable("id") final Long id, @RequestBody License license){
        Optional<License> l = licenseService.getLicense(id);
        if(l.isPresent()){
            License currentLicense = l.get();

            Member member = license.getMember();
            if(member != null){
                currentLicense.setMember(member);
            }

            String name = license.getName();
            if(name != null){
                currentLicense.setName(name);
            }

            Date dateOfValidity = license.getDateOfValidity();
            if(dateOfValidity != null){
                currentLicense.setDateOfValidity(dateOfValidity);
            }

            LicenseType licenseType = license.getLicenseType();
            if(licenseType != null){
                currentLicense.setLicenseType(licenseType);
            }

            /*GunType gunType = license.getGunType();
            if(gunType != null){
                currentLicense.setGunType(gunType);
            }*/

            licenseService.saveLicense(currentLicense);
            return currentLicense;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/license/{id}")
    public void deleteLicense(@PathVariable("id") final Long id){
        licenseService.deleteLicense(id);
    }
    
}
