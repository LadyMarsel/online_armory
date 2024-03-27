/*-----License Type-----
 * C'est le nom du papier avec lequel on peut obtenir une arme
 * Chaque papier donne des droits d'accès différents à la bibliothèque des armes
 * Chaque papier s'obtient de manière différente
 */
package com.project.models;


import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum LicenseType {

/*Type de la license :  */

    M4("Model 4", "Tir récréatif", new ArrayList<>()),
    M9_SPORT("Modèle 9 Sportif", "Tir sportif", new ArrayList<>()),
    M9_HUNT("Modèle 9 de Chasse", "Chasse", new ArrayList<>()),
    M6A("Modèle 6A", "Détention temporaire", new ArrayList<>()),
    M_GUNSMITH("Modèle d'armurier", "Détention pour armurerie", new ArrayList<>()),
    M_COLLECTION("Modèle pour Collection", "Détention pour panoplie", new ArrayList<>()),
    ;

    private final String name;
    private final String description;

    @OneToMany
    private final List<Caliber> caliber;
    
}
