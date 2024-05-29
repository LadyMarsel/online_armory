package com.project.models;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Country {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    //Un pays peut avoir plusieurs fabricants
    @OneToMany
    private List<Company> companies;

    @OneToMany
    private List<Professionnal> professionnal;

    public Country(String name){
        this.name = name;
    }

}
