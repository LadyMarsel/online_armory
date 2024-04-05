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
}
