package com.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.Caliber;
import com.project.repositories.CaliberRepository;

@Service
public class CaliberService {

    @Autowired
    private CaliberRepository caliberRepository;

    public Optional<Caliber> getCaliber(final Long id){
        return caliberRepository.findById(id);
    }

    public Iterable<Caliber> getCalibers(){
        return caliberRepository.findAll();
    }
}
