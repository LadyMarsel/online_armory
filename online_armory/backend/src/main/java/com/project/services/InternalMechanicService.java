package com.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.InternalMechanic;
import com.project.repositories.InternalMechanicRepository;

@Service
public class InternalMechanicService {
    
    @Autowired
    private InternalMechanicRepository internalMechanicRepository;

    /* Read - Get one if it exist */

    public Optional<InternalMechanic> getInternalMechanic(final Long id){
        return internalMechanicRepository.findById(id);
    }

    /* Read - Get all */

    public Iterable<InternalMechanic> getInternalMechanics(){
        return internalMechanicRepository.findAll();
    }

    /* Delete - Delete one */

    public void deleteInternalMechanic(final Long id){
        internalMechanicRepository.deleteById(id);
    }

    /* Create || Save - Create || Save one */

    public InternalMechanic saveInternalMechanic(InternalMechanic internalMechanic){
        InternalMechanic saveInternalMechanic = internalMechanicRepository.save(internalMechanic);
        return saveInternalMechanic;
    }
    
}
