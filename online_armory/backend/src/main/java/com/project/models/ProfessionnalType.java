/*-----Prof Type-----
 * Type de professionel du monde de l'armurerie
 */
package com.project.models;


import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum ProfessionnalType {
    
/*Type de professionel : */

    Armory("Arumurerie", ""),
    ShootingClub("Club de tir", ""),
    ;

    private final String name;
    private final String description;

}
