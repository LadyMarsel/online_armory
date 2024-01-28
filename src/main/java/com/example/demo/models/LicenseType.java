/*-----License Type-----
 * C'est le type d'une license
 * Chaque type donne des droits d'accès différents à la bibliothèque des armes
 * Chaque type s'obtient de manière différente
 */
package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public enum LicenseType {

/*Type de la license :  */

    M4("Model 4", ""),
    M9_SPORT("Modèle 9 Sportif", ""),
    M9_HUNT("Modèle 9 de Chasse", ""),
    M6A("Modèle 6A", ""),
    M_GUNSMITH("Modèle d'armurier", ""),
    M_COLLECTION("Modèle pour Collection", ""),
    ;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    LicenseType(String name, String description){
        this.name = name;
        this.description = description;
    }
    
}
