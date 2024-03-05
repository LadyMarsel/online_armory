package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.Company;
import com.project.models.Member;
import com.project.services.CompanyService;

@CrossOrigin
@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public Iterable<Company> getCompanies(){
        System.out.println("coucou");
        return companyService.getCompanies();
    }

        @GetMapping("/company/{companyId}")
        public Optional<Company> getCompany(@PathVariable Long companyId){
            return companyService.getCompany(companyId);
    }

}