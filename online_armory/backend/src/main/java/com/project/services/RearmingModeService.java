package com.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.RearmingMode;
import com.project.repositories.RearmingModeRepository;

@Service
public class RearmingModeService {
    @Autowired
    private RearmingModeRepository rearmingModeRepository;

    public Optional<RearmingMode> getRearmingMode(final Long id){
        return rearmingModeRepository.findById(id);
    }

    public Iterable<RearmingMode> getRearmingModes(){
        return rearmingModeRepository.findAll();
    }
    
}
