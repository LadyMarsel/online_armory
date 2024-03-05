package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.Gun;
import com.project.models.Member;
import com.project.services.GunService;

@CrossOrigin
@RestController
public class GunController {

    @Autowired
    private GunService gunService;

    @GetMapping("/guns")
    public Iterable<Gun> getGuns(){
        return gunService.getGuns();
    }

        @GetMapping("/gun/{gunId}")
        public Optional<Gun> getGun(@PathVariable Long gunId){
            return gunService.getGun(gunId);
    }
    
}