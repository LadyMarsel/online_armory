/*-----Prof Type-----
 * Type de professionel du monde de l'armurerie
 * Exemple 
 * Armory("Arumurerie", ""),
 * ShootingClub("Club de tir", ""),
 */
package com.project.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ProfessionnalType {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    @OneToOne
    private Professionnal professionnal;

    public ProfessionnalType(String name, String description){
        this.name = name;
        this.description = description;
    }

}
