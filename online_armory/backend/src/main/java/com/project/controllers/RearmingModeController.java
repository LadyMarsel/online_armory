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
}
