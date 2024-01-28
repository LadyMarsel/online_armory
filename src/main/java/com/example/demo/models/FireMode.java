/*-----Fire Mode-----
 * C'est le mode d'action de la mise à feu des munitions, autrement dit le mécanisme
 * C'est une énumération car il n'y a pas de nouvelles données à mettre une fois l'app lancée, la donnée est fixée d'avance
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
public enum FireMode {

/* Modes d'action : */

    AUTOMATIC("Automatic", ""),
    SEMIAUTOMATIC("Semi Automatique", ""),
    ;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    FireMode(String name, String description){
        this.name = name;
        this.description = description;
    }
    
}
