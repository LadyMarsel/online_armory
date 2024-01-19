package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class License {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private Member member;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date dateOfValidity;
    @Enumerated(EnumType.STRING)
    private LicenseType licenseType;
    
    @ManyToMany
    private List<GunType> gunTypes;
}
