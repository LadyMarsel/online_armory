/*-----Prof Type-----
 * Type de professionel du monde de l'armurerie
 */
package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public enum ProfType {
    
/*Type de professionel : */

    Armory("Arumurerie", ""),
    ShootingClub("Club de tir", ""),
    ;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    ProfType(String name, String description){
        this.name = name;
        this.description = description;
    }


}
