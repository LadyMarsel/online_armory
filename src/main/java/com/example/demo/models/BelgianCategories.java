/*-----Belgian Category-----
 * Ce sont les 5 catégories réglementaires en Belgique. 
 * Elles sont inscrites sur les licenses des membres pour indiquer les armes avec lesquelles ils peuvent tirer, ainsi que celles qu'ils peuvent acheter.
 * Elles constituent un filtre supplémentaire pour un affichage correcte des armes et des autorisations néccéssaires pour l'achat.
 */
package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public enum BelgianCategories {

    /* Catégorie Belge d'arme à feu :  */

    A("Catégorie A"),//Revolver
    B("Catégorie B"),//Pistolet
    C("Catégorie C"),//Carabine
    D("Catégorie D"),//Fusil
    E("Catégorie E"),//Poudre noire
    ;

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    BelgianCategories(String name){
        this.name = name;
    }
    
}
