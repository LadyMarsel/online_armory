package com.project.models;

import java.util.List;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class InternalMechanic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String url;

    @OneToMany
    private List<Gun> guns;

    public InternalMechanic(String name, String description, String url){
        this.name = name;
        this.description = description;
        this.url = url;
    }
    
}
