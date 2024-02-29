package com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.models.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {

    
}
