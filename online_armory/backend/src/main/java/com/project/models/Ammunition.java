/*-----Ammunition-----
 * C'est les munitions
 * Cela comprend le nom officiel de la munition aisini que sa marque, mais aussi sa taille, dans le système métrique, dans le système des pouces
 */
package com.project.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Ammunition {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    
    @ManyToOne
    private Company company;//Marque

    @Enumerated(EnumType.STRING)
    private Caliber caliber;//Calibre 
     
    private String description;
    private String img;

    public Ammunition(String name, Company company, Caliber caliber, String description, String img){
        this.name = name;
        this.company = company;
        this.caliber = caliber;
        this.description = description;
        this.img = img;
    }
    
} 
