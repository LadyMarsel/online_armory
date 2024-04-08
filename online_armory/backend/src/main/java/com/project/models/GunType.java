/* -----Gun Type-----
* Il existe 4 grands types d'armes : Pistolet, Revolver, Fusil, Carabine.
* Ces types découlent de 2 familles : "Arme de poing" et "Canon long".
* Ces types ont des particularités techniques au niveau de leur canon : ilk peut être rayé ou lisse
* Enfin, ces 4 types sont catégorisé, en Belgique, à l'aide de lettres : A, B, C, D et E pour la poudre noire
* Exemple
* REVOLVER("Revolver", "Canon rayé", GunFamily.HAND_GUN, "A"),
* PISTOLET("Pistolet", "Canon rayé", GunFamily.HAND_GUN, "B"),
* FUSIL("Fusil", "Canon lisse", GunFamily.LONG_BAREL, "C"),
* CARABINE("Carabine", "Canon rayé", GunFamily.LONG_BAREL, "D"),Probème : Tous peuvent être de catégorie E aussi...
*/
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
public class GunType {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String barelType;//Canon lisse ou canon rayé
    private String gunFamily;//Arme de poing ou canon long
    private String belgianCategory;//Catégorie belge (A, B, C ou D)

    @OneToMany
    private List<Gun> guns;

    @ManyToMany
    private List<License> licenses;

    public GunType(String name, String barelType, String gunFamily, String belgianCategory){
        this.name = name;
        this.barelType = barelType;
        this.gunFamily = gunFamily;
        this.belgianCategory = belgianCategory;
    }
    
}
    
