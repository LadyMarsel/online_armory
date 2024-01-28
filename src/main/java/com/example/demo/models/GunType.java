/* -----Gun Type-----
* Catégorie législative de l'arme, en Belgique, et logique, par rapport au 2 familles d'arme à feu
* C'est une énumération car il n'y a pas de nouvelles données à mettre une fois l'app lancée, la donnée est fixée d'avance
*/
package com.example.demo.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public enum GunType {
        
/* Type d'arme  */

    REVOLVER("Revolver", "", GunFamily.HAND_GUN, GunTypeCategory.A),
    PISTOLET("Pistolet", "", GunFamily.HAND_GUN, GunTypeCategory.B),
    CARABINE("Carabine", "Canon rayé", GunFamily.LONG_BAREL, GunTypeCategory.C),
    FUSIL("Fusil", "Canon lisse", GunFamily.LONG_BAREL, GunTypeCategory.D),//Probème : Tous peuvent être de catégorie E aussi...
    ;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private GunFamily gunFamily;

    @Enumerated(EnumType.STRING)
    private GunTypeCategory gunTypeCategory;//Catégorie belge (A, B, C ou D)

    GunType(String name, String description, GunFamily gunFamily, GunTypeCategory gunTypeCategory){
        this.name = name;
        this.description = description;
        this.gunFamily = gunFamily;
        this.gunTypeCategory = gunTypeCategory;
    }
    
}
    
