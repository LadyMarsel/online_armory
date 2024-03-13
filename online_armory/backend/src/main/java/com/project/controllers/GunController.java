package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.Company;
import com.project.models.FiringMode;
import com.project.models.Gun;
import com.project.models.GunCaliber;
import com.project.models.GunType;
import com.project.services.GunService;

@CrossOrigin
@RestController
public class GunController {

    @Autowired
    private GunService gunService;

    /* Read - Get all */

    @GetMapping("/guns")
    public Iterable<Gun> getGuns(){
        return gunService.getGuns();
    }

    /* Read - Get one if it exist */

    @GetMapping("/gun/{id}")
    public Gun getGun(@PathVariable("id") final Long id){
        Optional<Gun> gun = gunService.getGun(id);
        if(gun.isPresent()){
            return gun.get();
        }else{
            return null;
        }
    }

    /* Create - Create one */

    @PostMapping("/gun")
    public Gun createGun(@RequestBody Gun gun){
        return gunService.saveGun(gun);
    }

    /* Update - Update an existing one */

    @PutMapping("/gun/{id}")
    public Gun updateGun(@PathVariable("id") final Long id, @RequestBody Gun gun){
        Optional<Gun> g = gunService.getGun(id);
        if(g.isPresent()){
            Gun currentGun = g.get();

            Company company = gun.getCompany();
            if(company != null){
                currentGun.setCompany(company);
            }

            GunType gunType = gun.getGunType();
            if(gunType != null){
                currentGun.setGunType(gunType);
            }

            FiringMode firingMode = gun.getFiringMode();
            if(firingMode != null){
                currentGun.setFiringMode(firingMode);
            }

            GunCaliber gunCaliber = gun.getGunCaliber();
            if(gunCaliber != null){
                currentGun.setGunCaliber(gunCaliber);
            }

            String name = gun.getName();
            if(name != null){
                currentGun.setName(name);
            }

            String country = gun.getCountry();
            if(country != null){
                currentGun.setCountry(country);
            }

            String year = gun.getYear();
            if(year != null){
                currentGun.setYear(year);
            }

            String description = gun.getDescription();
            if(description != null){
                currentGun.setDescription(description);
            }

            String img = gun.getImg();
            if(img != null){
                currentGun.setImg(img);
            }

            int barelSize = gun.getBarelSize();
            if(barelSize != 0){
                currentGun.setBarelSize(barelSize);
            }

            int totalSize = gun.getTotalSize();
            if(totalSize != 0){
                currentGun.setTotalSize(totalSize);
            }

            gunService.saveGun(currentGun);
            return currentGun;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/gun/{id}")
    public void deleteGun(@PathVariable("id") final Long id){
        gunService.deleteGun(id);
    }
    
}