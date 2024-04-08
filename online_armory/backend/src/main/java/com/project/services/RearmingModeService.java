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

    /* Read - Get one if it exist */

    public Optional<RearmingMode> getRearmingMode(final Long id){
        return rearmingModeRepository.findById(id);
    }

    /* Read - Get all */

    public Iterable<RearmingMode> getRearmingModes(){
        return rearmingModeRepository.findAll();
    }

    /* Delete - Delete one */

    public void deleteRearmingMode(final Long id){
        rearmingModeRepository.deleteById(id);
    }

    /* Create || Save - Create || Save one */

    public RearmingMode saveRearmingMode(RearmingMode rearmingMode){
        RearmingMode saveRearmingMode = rearmingModeRepository.save(rearmingMode);
        return saveRearmingMode;
    }
    
}
