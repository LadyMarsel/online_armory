package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.ProfessionnalType;
import com.project.services.ProfessionnalTypeService;

@CrossOrigin
@RestController
public class ProfessionnalTypeController {

    @Autowired
    private ProfessionnalTypeService professionnalTypeService;

    /* Read - Get all */

    @GetMapping("/professionnalTypes")
    public Iterable<ProfessionnalType> getProfessionnalTypes(){
        return professionnalTypeService.getProfessionnalTypes();
    }

    /* Read - Get one if it exist */

    @GetMapping("/professionnalType/{id}")
    public ProfessionnalType getProfessionnalType(@PathVariable("id") final Long id){
        Optional<ProfessionnalType> professionnalType =  professionnalTypeService.getProfessionnalType(id);
        if(professionnalType.isPresent()){
            return professionnalType.get();
        }else{
            return null;
        }
    }   

    /* Create - Create one */

    @PostMapping("/professionnalType")
    public ProfessionnalType createProfessionnalType(@RequestBody ProfessionnalType professionnalType){
        return professionnalTypeService.saveProfessionnalType(professionnalType);
    }

    /* Update - Update an existing one */

    @PutMapping("/professionnalType/{id}")
    public ProfessionnalType updateProfessionnalType(@PathVariable("id") final Long id, @RequestBody ProfessionnalType professionnalType){
        Optional<ProfessionnalType> a = professionnalTypeService.getProfessionnalType(id);
        if(a.isPresent()){
            ProfessionnalType currentProfessionnalType = a.get();

            String name = professionnalType.getName();
            if(name != null){
                currentProfessionnalType.setName(name);
            }

            String description = professionnalType.getDescription();
            if(description != null){
                currentProfessionnalType.setDescription(description);
            }

            professionnalTypeService.saveProfessionnalType(currentProfessionnalType);
            return currentProfessionnalType;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/professionnalType/{id}")
    public void deleteProfessionnalType(@PathVariable("id") final Long id){
        professionnalTypeService.deleteProfessionnalType(id);
    }
}
