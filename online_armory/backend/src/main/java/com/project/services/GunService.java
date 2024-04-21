package com.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.Gun;
import com.project.repositories.GunRepository;

@Service
public class GunService {

    @Autowired
    private GunRepository gunRepository;

    /* Read - Get one if it exist */

    public Optional<Gun> getGun(final Long id){
        return gunRepository.findById(id);
    }

    /* Read - Get all */

    public Iterable<Gun> getGuns(){
        return gunRepository.findAll();
    }

    /* Delete - Delete one */

    public void deleteGun(final Long id){
        gunRepository.deleteById(id);
    }

    /* Create || Save - Create || Save one */

    public Gun saveGun(Gun gun){
        Gun savedGun = gunRepository.save(gun);
        return savedGun;
    }
    
}
