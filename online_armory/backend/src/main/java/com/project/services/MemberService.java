package com.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.models.Member;
import com.project.repositories.MemberRepository;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    /* Read - Get one if it exist */
    
    public Optional<Member> getMember(final Long id){
        return memberRepository.findById(id);
    }

    /* Read - Get all */

    public Iterable<Member> getMembers(){
        return memberRepository.findAll();
    }

    /* Delete - Delete one */

    public void deleteMember(final Long id){
        memberRepository.deleteById(id);
    }
    
    /* Create || Save - Create || Save one */

    public Member saveMember(Member member){
        Member savedMember = memberRepository.save(member);
        return savedMember;
    }
    
}
