package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.Company;
import com.project.models.Country;
import com.project.services.CompanyService;


@CrossOrigin
@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    /* Read - Get all */

    @GetMapping("/companies")
    public Iterable<Company> getCompanies(){
        return companyService.getCompanies();
    }

    /* Read - Get one if it exist */

    @GetMapping("/company/{id}")
    public Company getCompany(@PathVariable("id") final Long id){
        Optional<Company> company = companyService.getCompany(id);
        if(company.isPresent()){
            return company.get();
        }else{
            return null;
        }
    }

    /* Create - Create one */
    
    @PostMapping("/company")
    public Company createCompany(@RequestBody Company company){
        return companyService.saveCompany(company);
    }

    /* Update - Update an existing one */

    @PutMapping("/company/{id}")
    public Company updateCompany(@PathVariable("id") final Long id, @RequestBody Company company){
        Optional<Company> c = companyService.getCompany(id);
        if(c.isPresent()){
            Company currentCompany = c.get();

            String name = company.getName();
            if(name != null){
                currentCompany.setName(name);
            }

            String year = company.getYear();
            if(year != null){
                currentCompany.setYear(year);
            }
            
            Country country = company.getCountry();
            if(country != null){
                currentCompany.setCountry(country);
            }

            String description = company.getDescription();
            if(description != null){
                currentCompany.setDescription(description);
            }

            String logo = company.getLogo();
            if(logo != null){
                currentCompany.setLogo(logo);
            }

            companyService.saveCompany(currentCompany);
            return currentCompany;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/company/{id}")
    public void deleteCompany(@PathVariable("id") final Long id){
        companyService.deleteCompany(id);
    }

}