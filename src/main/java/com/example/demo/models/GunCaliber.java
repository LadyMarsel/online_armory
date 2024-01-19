package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public enum GunCaliber {

    LONGRIFLE_22("22 Long Rifle", 6, ""),
    ;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private int size; 
    private String description;

    GunCaliber(String name, int size, String description){
        this.name = name;
        this.size = size;
        this.description = description;
    }
    
}
