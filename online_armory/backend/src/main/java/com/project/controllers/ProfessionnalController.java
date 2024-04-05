package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.Professionnal;
import com.project.models.ProfessionnalType;
import com.project.services.ProfessionnalService;

@CrossOrigin
@RestController
public class ProfessionnalController {

   @Autowired
    private ProfessionnalService professionnalService;

    /* Read - Get all */

    @GetMapping("/professionnals")
    public Iterable<Professionnal> getProfessionnals(){
        return professionnalService.getProfessionnals();
    }

    /* Read - Get one if it exist */

    @GetMapping("/professionnal/{id}")
    public Professionnal getProfessionnal(@PathVariable("id") final Long id){
        Optional<Professionnal> professionnal = professionnalService.getProfessionnal(id);
        if(professionnal.isPresent()){
            return professionnal.get();
        }else{
            return null;
        }
    }

    /* Create - Create one */
    
    @PostMapping("/professionnal")
    public Professionnal createProfessionnal(@RequestBody Professionnal professionnal){
        return professionnalService.saveProfessionnal(professionnal);
    }

    /* Update - Update an existing one */

    @PutMapping("/professionnal/{id}")
    public Professionnal updateProfessionnal(@PathVariable("id") final Long id, @RequestBody Professionnal professionnal){
        Optional<Professionnal> p = professionnalService.getProfessionnal(id);
        if(p.isPresent()){
            Professionnal currentProfessionnal = p.get();

            String name = professionnal.getName();
            if(name != null){
                currentProfessionnal.setName(name);
            }

            String country = professionnal.getCountry();
            if(country != null){
                currentProfessionnal.setCountry(country);
            }

            String year = professionnal.getYear();
            if(year != null){
                currentProfessionnal.setYear(year);
            }

            String description = professionnal.getDescription();
            if(description != null){
                currentProfessionnal.setDescription(description);
            }

            String adress = professionnal.getAdress();
            if(adress != null){
                currentProfessionnal.setAdress(adress);
            }

            String email = professionnal.getEmail();
            if(email != null){
                currentProfessionnal.setEmail(email);
            }

            int phone = professionnal.getPhone();
            if(phone != 0){
                currentProfessionnal.setPhone(phone);
            }

            String webSite = professionnal.getWebSite();
            if(webSite != null){
                currentProfessionnal.setWebSite(webSite);
            }

            // ! ProfessionnalType doit être existant !
            ProfessionnalType professionnalType = professionnal.getProfessionnalType();
            if(professionnalType != null){
                currentProfessionnal.setProfessionnalType(professionnalType);
            }

            professionnalService.saveProfessionnal(currentProfessionnal);
            return currentProfessionnal;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/professionnal/{id}")
    public void deleteProfessionnal(@PathVariable("id") final Long id){
        professionnalService.deleteProfessionnal(id);
    }
    
}