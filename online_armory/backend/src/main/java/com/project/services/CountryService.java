package com.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.Country;
import com.project.repositories.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

        /* Read - Get one if it exist */

    public Optional<Country> getCountry(final Long id){
        return countryRepository.findById(id);
    }

    /* Read - Get all */

    public Iterable<Country> getCountries(){
        return countryRepository.findAll();
    }

    /* Delete - Delete one */

    public void deleteCountry(final Long id){
        countryRepository.deleteById(id);
    }

    /* Create || Save - Create || Save one */

    public Country saveCountry(Country country){
        Country savedCountry = countryRepository.save(country);
        return savedCountry;
    }

}
