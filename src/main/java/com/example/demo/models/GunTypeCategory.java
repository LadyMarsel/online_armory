package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public enum GunTypeCategory {

    /* Catégorie Belge d'arme à feu :  */

    A("Catégorie A", "Revolver"),
    B("Catégorie B", "Pistolet"),
    C("Catégorie C", "Carabine"),
    D("Catégorie D", "Fusil"),
    EL("Catégorie E-CL", "Poudre noire, canon long"),
    EH("Catégorie E-AP", "Poudre noire, arme de poing"),
    ;

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;

    GunTypeCategory(String name, String description){
        this.name = name;
        this.description = description;
    }
    
}
