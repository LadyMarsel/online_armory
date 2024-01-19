package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class GunModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private GunType gunType;
    private FireMode fireMode;

    @ManyToOne
    private GunLabel gunLabel;
    private GunCaliber gunCaliber;
    private String name;
    private String year;
    private String description;
    private String img;
    
}
