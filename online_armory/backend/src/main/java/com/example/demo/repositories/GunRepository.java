package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Gun;

public interface GunRepository extends CrudRepository<Gun, Long> {

    
}
