package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.Company;
import com.project.models.RearmingMode;
import com.project.models.Gun;
import com.project.models.Caliber;
import com.project.models.GunType;
import com.project.models.InternalMechanic;
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

            // ! Compagnie doit être existant !
            Company company = gun.getCompany();
            if(company != null){
                currentGun.setCompany(company);
            }

            // ! GunType doit être existant !
            GunType gunType = gun.getGunType();
            if(gunType != null){
                currentGun.setGunType(gunType);
            }

            // ! RearmingMode doit être existant !
            RearmingMode rearmingMode = gun.getRearmingMode();
            if(rearmingMode != null){
                currentGun.setRearmingMode(rearmingMode);
            }

            InternalMechanic internalMechanic = gun.getInternalMechanic();
            if(internalMechanic != null){
                currentGun.setInternalMechanic(internalMechanic);
            }

            // ! Caliber doit être existant !
            Caliber caliber = gun.getCaliber();
            if(caliber != null){
                currentGun.setCaliber(caliber);
            }

            String name = gun.getName();
            if(name != null){
                currentGun.setName(name);
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