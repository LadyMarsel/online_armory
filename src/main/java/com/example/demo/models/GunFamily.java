/*-----Gun Family-----
 * C'est la famille d'appartenance d'une arme
 * C'est une énumération car il n'y a pas de nouvelles données à mettre une fois l'app lancée, la donnée est fixée d'avance
 */
package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public enum GunFamily {

/*Type d'arme :  */

    LONG_BAREL("Canon long"),
    HAND_GUN("Arme de poing"),
    ;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id; 
    private String name;

    GunFamily(String name) {
        this.name = name;
    }

    
}
