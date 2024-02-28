package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.License;

public interface LicenseRepository extends CrudRepository<License, Long> {

    
}