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
    
}
