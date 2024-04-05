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

    public Optional<GunType> getGunType(final Long id){
        return gunTypeRepository.findById(id);
    }

    public Iterable<GunType> getGunTypes(){
        return gunTypeRepository.findAll();
    }
    
}
