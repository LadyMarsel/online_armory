/* -----Gun Type-----
* Il existe 4 grands types d'armes pour les catégoriser toutes, qui sont les 4 branches des 2 familles "Arme de poing" et "Canon long"
*En Belgique, nous avons décidé de mettre nos catégories légales en fonction de ces 4 types.
* C'est une énumération car il n'y a pas de nouvelles données à mettre une fois l'app lancée, la donnée est fixée d'avance
*/
package com.example.demo.models;


import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;


@Entity
@RequiredArgsConstructor
public enum GunType {
        
/* Type d'arme  */

    REVOLVER("Revolver", "", GunFamily.HAND_GUN, BelgianCategory.A),
    PISTOLET("Pistolet", "", GunFamily.HAND_GUN, BelgianCategory.B),
    CARABINE("Fusil", "Canon lisse", GunFamily.LONG_BAREL, BelgianCategory.C),
    FUSIL("Carabine", "Canon rayé", GunFamily.LONG_BAREL, BelgianCategory.D),//Probème : Tous peuvent être de catégorie E aussi...
    ;

    private final String name;
    private final String description;

    @Enumerated(EnumType.STRING)
    private final GunFamily gunFamily;//Arme de poing ou canon long

    @Enumerated(EnumType.STRING)
    private final BelgianCategory belgianCategory;//Catégorie belge (A, B, C ou D)
    
}
    
