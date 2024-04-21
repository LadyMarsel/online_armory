package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {

}