package com.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.GunType;
import com.project.repositories.GunTypeRepository;

@Service
public class GunTypeService {

    @Autowired
    private GunTypeRepository gunTypeRepository;

    /* Read - Get one if it exist */

    public Optional<GunType> getGunType(final Long id){
        return gunTypeRepository.findById(id);
    }

    /* Read - Get all */

    public Iterable<GunType> getGunTypes(){
        return gunTypeRepository.findAll();  
    }

    /* Delete - Delete one */

    public void deleteGunType(final Long id){
        gunTypeRepository.deleteById(id);
    }

    /* Create || Save - Create || Save one */

    public GunType saveGunType(GunType gunType){
        GunType saveGunType = gunTypeRepository.save(gunType);
        return saveGunType;
    }
}
