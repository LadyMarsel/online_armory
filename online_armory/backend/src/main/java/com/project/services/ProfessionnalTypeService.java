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

    public Optional<ProfessionnalType> getProfessionnalType(final Long id){
        return professionnalTypeRepository.findById(id);
    }

    public Iterable<ProfessionnalType> getProfessionnalTypes(){
        return professionnalTypeRepository.findAll();
    }
}
