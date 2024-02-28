package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {

    
}
