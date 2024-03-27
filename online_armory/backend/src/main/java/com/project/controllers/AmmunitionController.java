package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.Ammunition;
import com.project.models.Company;
import com.project.models.Caliber;
import com.project.services.AmmunitionService;


@CrossOrigin
@RestController
public class AmmunitionController {

    @Autowired
    private AmmunitionService ammunitionService;

    /* Read - Get all */

    @GetMapping("/ammunitions")
    public Iterable<Ammunition> getAmmunitions(){
        return ammunitionService.getAmmunitions();
    }

    /* Read - Get one if it exist */

    @GetMapping("/ammunition/{id}")
    public Ammunition getAmmunition(@PathVariable("id") final Long id){
        Optional<Ammunition> ammunition = ammunitionService.getAmmunition(id);
        if(ammunition.isPresent()){
            return ammunition.get();
        }else{
            return null;
        }
    }

    /* Create - Create one */

    @PostMapping("/ammunition")
    public Ammunition createAmmunition(@RequestBody Ammunition ammunition){
        return ammunitionService.saveAmmunition(ammunition);
    }

    /* Update - Update an existing one */

    @PutMapping("/ammunition/{id}")
    public Ammunition updateAmmunition(@PathVariable("id") final Long id, @RequestBody Ammunition ammunition){
        Optional<Ammunition> a = ammunitionService.getAmmunition(id);
        if(a.isPresent()){
            Ammunition currentAmmunition = a.get();

            String name = ammunition.getName();
            if(name != null){
                currentAmmunition.setName(name);
            }

            Company company = ammunition.getCompany();
            if(company != null){
                currentAmmunition.setCompany(company);
            }

            Caliber caliber = ammunition.getCaliber();
            if(caliber != null){
                currentAmmunition.setCaliber(caliber);
            }

            String description = ammunition.getDescription();
            if(description != null){
                currentAmmunition.setDescription(description);
            }

            String img = ammunition.getImg();
            if(img != null){
                currentAmmunition.setImg(img);
            }

            ammunitionService.saveAmmunition(currentAmmunition);
            return currentAmmunition;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/ammunition/{id}")
    public void deleteAmmunition(@PathVariable("id") final Long id){
        ammunitionService.deleteAmmunition(id);
    }
    
}