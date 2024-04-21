package com.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.ProfessionnalType;
import com.project.repositories.ProfessionnalTypeRepository;

@Service
public class ProfessionnalTypeService {
    
    @Autowired
    private ProfessionnalTypeRepository professionnalTypeRepository;

    /* Read - Get one if it exist */

    public Optional<ProfessionnalType> getProfessionnalType(final Long id){
        return professionnalTypeRepository.findById(id);
    }

    /* Read - Get all */

    public Iterable<ProfessionnalType> getProfessionnalTypes(){
        return professionnalTypeRepository.findAll();
    }

    /* Delete - Delete one */

    public void deleteProfessionnalType(final Long id){
        professionnalTypeRepository.deleteById(id);
    }

    /* Create || Save - Create || Save one */

    public ProfessionnalType saveProfessionnalType(ProfessionnalType professionnalType){
        ProfessionnalType saveProfessionnalType = professionnalTypeRepository.save(professionnalType);
        return saveProfessionnalType;
    }
}
