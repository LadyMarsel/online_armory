package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.Ammunition;
import com.project.services.AmmunitionService;

@RestController
public class AmmunitionController {

    @Autowired
    private AmmunitionService ammunitionService;

    public Iterable<Ammunition> getAmmunitions(){
        return ammunitionService.getAmmunitions();
    }


    
}