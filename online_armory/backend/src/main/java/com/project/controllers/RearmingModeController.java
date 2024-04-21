package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.RearmingMode;
import com.project.services.RearmingModeService;

@CrossOrigin
@RestController
public class RearmingModeController {
    
    @Autowired
    private RearmingModeService rearmingModeService;

    /* Read - Get all */

    @GetMapping("/rearmingModes")
    public Iterable<RearmingMode> getRearmingModes(){
        return rearmingModeService.getRearmingModes();
    }

    /* Read - Get one if it exist */

    @GetMapping("/rearmingMode/{id}")
    public RearmingMode getRearmingMode(@PathVariable("id") final Long id){
        Optional<RearmingMode> rearmingMode =  rearmingModeService.getRearmingMode(id);
        if(rearmingMode.isPresent()){
            return rearmingMode.get();
        }else{
            return null;
        }
    }

    /* Create - Create one */

    @PostMapping("/rearmingMode")
    public RearmingMode createRearmingMode(@RequestBody RearmingMode rearmingMode){
        return rearmingModeService.saveRearmingMode(rearmingMode);
    }

    /* Update - Update an existing one */

    @PutMapping("/rearmingMode/{id}")
    public RearmingMode updateRearmingMode(@PathVariable("id") final Long id, @RequestBody RearmingMode rearmingMode){
        Optional<RearmingMode> a = rearmingModeService.getRearmingMode(id);
        if(a.isPresent()){
            RearmingMode currentRearmingMode = a.get();

            String name = rearmingMode.getName();
            if(name != null){
                currentRearmingMode.setName(name);
            }

            String description = rearmingMode.getDescription();
            if(description != null){
                currentRearmingMode.setDescription(description);
            }

            rearmingModeService.saveRearmingMode(currentRearmingMode);
            return currentRearmingMode;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/rearmingMode/{id}")
    public void deleteRearmingMode(@PathVariable("id") final Long id){
        rearmingModeService.deleteRearmingMode(id);
    }
}
