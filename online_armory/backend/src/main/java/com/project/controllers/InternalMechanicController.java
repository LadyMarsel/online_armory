package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.InternalMechanic;
import com.project.services.InternalMechanicService;

@RestController
@CrossOrigin
public class InternalMechanicController {
    
    @Autowired
    private InternalMechanicService internalMechanicService;

    /* Read - Get all */

    @GetMapping("/internalMechanics")
    public Iterable<InternalMechanic> getInternalMechanics(){
        return internalMechanicService.getInternalMechanics();
    }

    /* Read - Get one if it exist */

    @GetMapping("/internalMechanic/{id}")
    public InternalMechanic getInternalMechanic(@PathVariable("id") final Long id){
        Optional<InternalMechanic> internalMechanic =  internalMechanicService.getInternalMechanic(id);
        if(internalMechanic.isPresent()){
            return internalMechanic.get();
        }else{
            return null;
        }
    }

    /* Create - Create one */

    @PostMapping("/internalMechanic")
    public InternalMechanic createInternalMechanic(@RequestBody InternalMechanic internalMechanic){
        return internalMechanicService.saveInternalMechanic(internalMechanic);
    }

    /* Update - Update an existing one */

    @PutMapping("/internalMechanic/{id}")
    public InternalMechanic updateInternalMechanic(@PathVariable("id") final Long id, @RequestBody InternalMechanic internalMechanic){
        Optional<InternalMechanic> a = internalMechanicService.getInternalMechanic(id);
        if(a.isPresent()){
            InternalMechanic currentInternalMechanic = a.get();

            String name = internalMechanic.getName();
            if(name != null){
                currentInternalMechanic.setName(name);
            }

            String description = internalMechanic.getDescription();
            if(description != null){
                currentInternalMechanic.setDescription(description);
            }

            String url = internalMechanic.getUrl();
            if(url != null){
                currentInternalMechanic.setUrl(url);
            }

            internalMechanicService.saveInternalMechanic(currentInternalMechanic);
            return currentInternalMechanic;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/internalMechanic/{id}")
    public void deleteInternalMechanic(@PathVariable("id") final Long id){
        internalMechanicService.deleteInternalMechanic(id);
    }
}
