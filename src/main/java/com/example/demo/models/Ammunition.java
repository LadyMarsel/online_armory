/*-----Ammunition-----
 * C'est les munitions
 * Cela comprend le nom officiel de la munition aisini que sa marque, mais aussi sa taille, dans le système métrique, dans le système des pouces
 */
package com.example.demo.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Ammunition {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    
    @ManyToOne
    private Company company;//Marque

    @OneToOne
    private GunCaliber gunCaliber;
     
    private String description;

    public Ammunition(String name, Company company, GunCaliber gunCaliber, String description){
        this.name = name;
        this.company = company;
        this.gunCaliber = gunCaliber;
        this.description = description;
    }
    
} 
