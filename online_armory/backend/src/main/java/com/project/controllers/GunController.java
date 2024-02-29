package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.Gun;
import com.project.services.GunService;

@RestController
public class GunController {

    @Autowired
    private GunService gunService;

    @GetMapping("/guns")
    public Iterable<Gun> getGuns(){
        return gunService.getGuns();
    }


    
}