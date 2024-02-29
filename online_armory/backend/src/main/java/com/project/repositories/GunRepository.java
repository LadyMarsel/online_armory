package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.Gun;

@Repository
public interface GunRepository extends CrudRepository<Gun, Long> {

    
}
