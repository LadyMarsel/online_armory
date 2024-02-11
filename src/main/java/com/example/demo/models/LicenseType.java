/*-----License Paper-----
 * C'est le nom du papier avec lequel on peut obtenir une arme
 * Chaque papier donne des droits d'accès différents à la bibliothèque des armes
 * Chaque papier s'obtient de manière différente
 */
package com.example.demo.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public enum LicenseType {

/*Type de la license :  */

    M4("Model 4", "Tir récréatif", new ArrayList()),
    M9_SPORT("Modèle 9 Sportif", "Tir sportif", new ArrayList()),
    M9_HUNT("Modèle 9 de Chasse", "Chasse", new ArrayList()),
    M6A("Modèle 6A", "Détention temporaire", new ArrayList()),
    M_GUNSMITH("Modèle d'armurier", "Détention pour armurerie", new ArrayList()),
    M_COLLECTION("Modèle pour Collection", "Détention pour panoplie", new ArrayList()),
    ;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    @OneToMany
    private List<GunCaliber> gunCaliber;

    LicenseType(String name, String description, List<GunCaliber> gunCaliber){
        this.name = name;
        this.description = description;
        this.gunCaliber = gunCaliber;
    }
    
}
