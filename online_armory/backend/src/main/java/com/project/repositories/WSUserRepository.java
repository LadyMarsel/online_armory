package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.WSUser;

@Repository
public interface WSUserRepository extends CrudRepository<WSUser, Long> {
    public WSUser findByUsername(String username);

}
