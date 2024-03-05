package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.Ammunition;
import com.project.services.AmmunitionService;

@CrossOrigin
@RestController
public class AmmunitionController {

    @Autowired
    private AmmunitionService ammunitionService;

    @GetMapping("/ammunitions")
    public Iterable<Ammunition> getAmmunitions(){
        return ammunitionService.getAmmunitions();
    }

    @GetMapping("/ammunition/{ammunitionId}")
    public Optional<Ammunition> getAmmunition(@PathVariable Long ammunitionId){
        return ammunitionService.getAmmunition(ammunitionId);
    }
    
}