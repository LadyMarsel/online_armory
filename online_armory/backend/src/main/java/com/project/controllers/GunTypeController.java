package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.GunType;
import com.project.services.GunTypeService;

@CrossOrigin
@RestController
public class GunTypeController {

    @Autowired
    private GunTypeService gunTypeService;

    /* Read - Get all */

    @GetMapping("/gunTypes")
    public Iterable<GunType> getGunTypes(){
        return gunTypeService.getGunTypes();
    }

    /* Read - Get one if it exist */

    @GetMapping("/gunType/{id}")
    public GunType getGunType(@PathVariable("id") final Long id){
        Optional<GunType> gunType =  gunTypeService.getGunType(id);
        if(gunType.isPresent()){
            return gunType.get();
        }else{
            return null;
        }
    }

    /* Create - Create one */

    @PostMapping("/gunType")
    public GunType createGunType(@RequestBody GunType gunType){
        return gunTypeService.saveGunType(gunType);
    }

    /* Update - Update an existing one */

    @PutMapping("/gunType/{id}")
    public GunType updateGunType(@PathVariable("id") final Long id, @RequestBody GunType gunType){
        Optional<GunType> a = gunTypeService.getGunType(id);
        if(a.isPresent()){
            GunType currentGunType = a.get();

            String name = gunType.getName();
            if(name != null){
                currentGunType.setName(name);
            }

            String barelType = gunType.getBarelType();
            if(barelType != null){
                currentGunType.setBarelType(barelType);
            }

            String gunFamily = gunType.getGunFamily();
            if(gunFamily != null){
                currentGunType.setGunFamily(gunFamily);
            }

            String belgianCategory = gunType.getBelgianCategory();
            if(belgianCategory != null){
                currentGunType.setBelgianCategory(belgianCategory);
            }

            gunTypeService.saveGunType(currentGunType);
            return currentGunType;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/gunType/{id}")
    public void deleteGunType(@PathVariable("id") final Long id){
        gunTypeService.deleteGunType(id);
    }
    
}
