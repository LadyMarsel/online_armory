package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.Professionnal;
import com.project.services.ProfessionnalService;

@RestController
public class ProfessionnalController {

    @Autowired
    private ProfessionnalService professionnalService;

    @GetMapping("/professionnal")
    public Iterable<Professionnal> getProfessionnals(){
        return professionnalService.getProfessionnals();
    }

    
}