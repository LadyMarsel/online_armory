/*-----Ammunition-----
 * C'est les munitions
 * Cela comprend le nom officiel de la munition aisini que son fabricant, mais aussi sa taille, dans le système métrique, dans le système des pouces
 */
package com.project.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Ammunition {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    
    //Une munition ne peut avoir qu'un seul fabricant, mais un fabricant peut faire plusieurs munitions différentes
    @ManyToOne
    private Company company;//Marque
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
