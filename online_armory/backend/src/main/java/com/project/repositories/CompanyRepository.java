package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {

}