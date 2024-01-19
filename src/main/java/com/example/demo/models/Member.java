package com.example.demo.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Long pswd;

    public Member(String firstName, String lastName, String email, Long pswd){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pswd = pswd;
    }
    
}
