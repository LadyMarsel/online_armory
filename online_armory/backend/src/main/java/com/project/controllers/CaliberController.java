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

    /* Create - Create one */

    @PostMapping("/caliber")
    public Caliber createCaliber(@RequestBody Caliber caliber){
        return caliberService.saveCaliber(caliber);
    }

    /* Update - Update an existing one */

    @PutMapping("/caliber/{id}")
    public Caliber updateCaliber(@PathVariable("id") final Long id, @RequestBody Caliber caliber){
        Optional<Caliber> a = caliberService.getCaliber(id);
        if(a.isPresent()){
            Caliber currentCaliber = a.get();

            String inch = caliber.getInch();
            if(inch != null){
                currentCaliber.setInch(inch);
            }

            String metric = caliber.getMetric();
            if(metric != null){
                currentCaliber.setMetric(metric);
            }

            caliberService.saveCaliber(currentCaliber);
            return currentCaliber;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/caliber/{id}")
    public void deleteCaliber(@PathVariable("id") final Long id){
        caliberService.deleteCaliber(id);
    }
}
