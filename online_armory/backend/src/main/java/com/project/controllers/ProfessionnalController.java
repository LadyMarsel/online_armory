package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.Member;
import com.project.models.Professionnal;
import com.project.services.ProfessionnalService;

@CrossOrigin
@RestController
public class ProfessionnalController {

    @Autowired
    private ProfessionnalService professionnalService;

    @GetMapping("/professionnals")
    public Iterable<Professionnal> getProfessionnals(){
        return professionnalService.getProfessionnals();
    }

    @GetMapping("/professionnal/{professionnalId}")
    public Optional<Professionnal> getProfessionnal(@PathVariable Long professionnalId){
        return professionnalService.getProfessionnal(professionnalId);
    }
    
}