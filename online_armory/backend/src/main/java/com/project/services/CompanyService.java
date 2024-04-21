package com.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.Company;
import com.project.repositories.CompanyRepository;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    /* Read - Get one if it exist */

    public Optional<Company> getCompany(final Long id){
        return companyRepository.findById(id);
    }

    /* Read - Get all */

    public Iterable<Company> getCompanies(){
        return companyRepository.findAll();
    }

    /* Delete - Delete one */

    public void deleteCompany(final Long id){
        companyRepository.deleteById(id);
    }

    /* Create || Save - Create || Save one */

    public Company saveCompany(Company company){
        Company savedCompany = companyRepository.save(company);
        return savedCompany;
    }
    
}
