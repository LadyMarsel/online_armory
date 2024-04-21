package com.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.Ammunition;
import com.project.repositories.AmmunitionRepository;

@Service
public class AmmunitionService {

    @Autowired
    private AmmunitionRepository ammunitionRepository;

    /* Read - Get one if it exist */

    public Optional<Ammunition> getAmmunition(final Long id){
        return ammunitionRepository.findById(id);
    }

    /* Read - Get all */

    public Iterable<Ammunition> getAmmunitions(){
        return ammunitionRepository.findAll();
    }

    /* Delete - Delete one */

    public void deleteAmmunition(final Long id){
        ammunitionRepository.deleteById(id);
    }

    /* Create || Save - Create || Save one */

    public Ammunition saveAmmunition(Ammunition ammunition){
        Ammunition savedAmmunition = ammunitionRepository.save(ammunition);
        return savedAmmunition;
    }
    
}
