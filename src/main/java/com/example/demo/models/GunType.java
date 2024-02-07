/* -----Gun Type-----
* Il existe 4 grands types d'armes pour les catégoriser toutes, qui sont les 4 branches des 2 familles "Arme de poing" et "Canon long"
*En Belgique, nous avons décidé de mettre nos catégories légales en fonction de ces 4 types.
* C'est une énumération car il n'y a pas de nouvelles données à mettre une fois l'app lancée, la donnée est fixée d'avance
*/
package com.example.demo.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public enum GunType {
        
/* Type d'arme  */

    REVOLVER("Revolver", "", GunFamily.HAND_GUN, BelgianCategories.A),
    PISTOLET("Pistolet", "", GunFamily.HAND_GUN, BelgianCategories.B),
    CARABINE("Carabine", "Canon rayé", GunFamily.LONG_BAREL, BelgianCategories.C),
    FUSIL("Fusil", "Canon lisse", GunFamily.LONG_BAREL, BelgianCategories.D),//Probème : Tous peuvent être de catégorie E aussi...
    ;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private GunFamily gunFamily;//Arme de poing ou canon long

    @Enumerated(EnumType.STRING)
    private BelgianCategories belgianCategories;//Catégorie belge (A, B, C ou D)

    GunType(String name, String description, GunFamily gunFamily, BelgianCategories belgianCategories){
        this.name = name;
        this.description = description;
        this.gunFamily = gunFamily;
        this.belgianCategories = belgianCategories;
    }
    
}
    
