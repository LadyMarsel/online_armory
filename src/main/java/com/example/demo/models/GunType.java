package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public enum GunType {

    PISTOLET("Pistolet", "", GunTypeCategory.A),
    ;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id; 
    private String name;
    private String description;
    @Enumerated(EnumType.STRING)
    private GunTypeCategory category;

    GunType(String name, String description, GunTypeCategory category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    private enum GunTypeCategory{
        A,
        B,
        C,
        D,
        E,
        ;
    }
    
}
