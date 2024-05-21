package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.Country;
import com.project.services.CountryService;

public class CountryController {

    
    @Autowired
    private CountryService countryService;

    /* Read - Get all */

    @GetMapping("/countries")
    public Iterable<Country> getCountries(){
        return countryService.getCountries();
    }

    /* Read - Get one if it exist */

    @GetMapping("/country/{id}")
    public Country getCountry(@PathVariable("id") final Long id){
        Optional<Country> country = countryService.getCountry(id);
        if(country.isPresent()){
            return country.get();
        }else{
            return null;
        }
    }

    /* Create - Create one */

    @PostMapping("/country")
    public Country createCountry(@RequestBody Country country){
        return countryService.saveCountry(country);
    }

    /* Update - Update an existing one */

    @PutMapping("/country/{id}")
    public Country updateCountry(@PathVariable("id") final Long id, @RequestBody Country country){
        Optional<Country> g = countryService.getCountry(id);
        if(g.isPresent()){
            Country currentCountry = g.get();

            String name = country.getName();
            if(name != null){
                currentCountry.setName(name);
            }

            countryService.saveCountry(currentCountry);
            return currentCountry;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/country/{id}")
    public void deleteCountry(@PathVariable("id") final Long id){
        countryService.deleteCountry(id);
    }
}
