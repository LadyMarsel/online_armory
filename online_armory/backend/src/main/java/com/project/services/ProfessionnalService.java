package com.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.Professionnal;
import com.project.repositories.ProfessionnalRepository;

@Service
public class ProfessionnalService {

    @Autowired
    private ProfessionnalRepository professionnalRepository;

    public Optional<Professionnal> getProfessionnal(final Long id){
        return professionnalRepository.findById(id);
    }

    public Iterable<Professionnal> getProfessionnals(){
        return professionnalRepository.findAll();
    }

    public void deleteProfessionnal(final Long id){
        professionnalRepository.deleteById(id);
    }

    public Professionnal saveProfessionnal(Professionnal professionnal){
        Professionnal savedProfessionnal = professionnalRepository.save(professionnal);
        return savedProfessionnal;
    }
    
}
