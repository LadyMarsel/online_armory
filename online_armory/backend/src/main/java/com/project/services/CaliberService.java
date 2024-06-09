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

    /* Read - Get one if it exist */

    public Optional<Caliber> getCaliber(final Long id){
        return caliberRepository.findById(id);
    }

    /* Read - Get all */

    public Iterable<Caliber> getCalibers(){
        return caliberRepository.findAll();
    }

    /* Delete - Delete one */

    public void deleteCaliber(final Long id){
        caliberRepository.deleteById(id);
    }

    /* Create || Save - Create || Save one */

    public Caliber saveCaliber(Caliber caliber){
        Caliber saveCaliber = caliberRepository.save(caliber);
        return saveCaliber;
    }
}
