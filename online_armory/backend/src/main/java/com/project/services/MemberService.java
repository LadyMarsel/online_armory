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

    public Optional<Member> getMember(final Long id){
        return memberRepository.findById(id);
    }

    public Iterable<Member> getMembers(){
        return memberRepository.findAll();
    }

    public void deleteMember(final Long id){
        memberRepository.deleteById(id);
    }
    
    public Member saveMember(Member member){
        Member savedMember = memberRepository.save(member);
        return savedMember;
    }
    
}
