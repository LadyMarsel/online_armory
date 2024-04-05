package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.Professionnal;

@Repository
public interface ProfessionnalRepository extends CrudRepository<Professionnal, Long>{

}
