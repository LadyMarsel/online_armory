/*-----License Type-----
 * C'est le nom du papier avec lequel on peut obtenir une arme
 * Chaque papier donne des droits d'accès différents à la bibliothèque des armes, en fonction des calibres des armes
 * Chaque papier s'obtient de manière différente
 * Exemple 
 * M4("Model 4", "Tir récréatif", new ArrayList<>()),
 * M9_SPORT("Modèle 9 Sportif", "Tir sportif", new ArrayList<>()),
 * M9_HUNT("Modèle 9 de Chasse", "Chasse", new ArrayList<>()),
 * M6A("Modèle 6A", "Détention temporaire", new ArrayList<>()),
 * M_GUNSMITH("Modèle d'armurier", "Détention pour armurerie", new ArrayList<>()),
 * M_COLLECTION("Modèle pour Collection", "Détention pour panoplie", new ArrayList<>()),
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
public class LicenseType {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    //Classe associative néccéssaire. Un type de license peut contenir plusieurs Calibres, et un calibre peut avoir plusieurs licenses
    @ManyToMany
    private List<Caliber> caliber;
    
    public LicenseType(String name, String description, List<Caliber> caliber){
        this.name = name;
        this.description = description;
        this.caliber = caliber;
    }
}
