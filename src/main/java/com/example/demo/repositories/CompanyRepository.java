package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Company;

public interface CompanyRepository extends CrudRepository<Company, Long> {

    
}