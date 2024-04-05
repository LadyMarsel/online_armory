package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.Caliber;
import com.project.services.CaliberService;

@CrossOrigin
@RestController
public class CaliberController {
    
    @Autowired
    private CaliberService caliberService;

    /* Read - Get all */

    @GetMapping("/calibers")
    public Iterable<Caliber> getCalibers(){
        return caliberService.getCalibers();
    }

    /* Read - Get one if it exist */

    @GetMapping("/caliber/{id}")
    public Caliber getCaliber(@PathVariable("id") final Long id){
        Optional<Caliber> caliber =  caliberService.getCaliber(id);
        if(caliber.isPresent()){
            return caliber.get();
        }else{
            return null;
        }
    }
}
