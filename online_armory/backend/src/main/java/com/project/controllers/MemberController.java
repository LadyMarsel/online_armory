package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.Member;
import com.project.services.MemberService;

@CrossOrigin
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    /* Read - Get all */
    
    @GetMapping("/members")
    public Iterable<Member> getMembers(){
        return memberService.getMembers();
    }

    /* Read - Get one if it exist */

    @GetMapping("/member/{id}")
    public Member getMember(@PathVariable("id") final Long id){
        Optional<Member> member = memberService.getMember(id);
        if(member.isPresent()){
            return member.get();
        }else{
            return null;
        }
    }

    /* Create - Create one */

    @PostMapping("/member")
    public Member createMember(@RequestBody Member member){
        return memberService.saveMember(member);
    }

    /* Update - Update an existing */

    @PutMapping("/member/{id}")
    public Member updateMember(@PathVariable("id") final Long id, @RequestBody Member member){
        Optional<Member> m = memberService.getMember(id);
        if(m.isPresent()){
            Member currentMember = m.get();

            String firstName = member.getFirstName();
            if(firstName != null){
                currentMember.setFirstName(firstName);
            }

            String lastName = member.getLastName();
            if(lastName != null){
                currentMember.setLastName(lastName);
            }

            String email = member.getEmail();
            if(email != null){
                currentMember.setEmail(email);
            }

            Long pswd = member.getPswd();
            if(pswd != null){
                currentMember.setPswd(pswd);
            }

            memberService.saveMember(currentMember);
            return currentMember;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/member/{id}")
    public void deleteMember(@PathVariable("id") final Long id){
        memberService.deleteMember(id);
    }

}