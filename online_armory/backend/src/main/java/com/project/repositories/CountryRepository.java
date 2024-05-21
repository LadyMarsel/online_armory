package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

}
