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
public enum GunCaliber {

    C9("", ""),
    ;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String inch;
    private String metric;

    GunCaliber(String inch, String metric){
        this.inch = inch;
        this.metric = metric;
    } 
    
}
