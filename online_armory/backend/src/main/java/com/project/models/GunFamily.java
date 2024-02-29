/*-----Gun Family-----
 * C'est la famille d'appartenance d'une arme
 * C'est une énumération car il n'y a pas de nouvelles données à mettre une fois l'app lancée, la donnée est fixée d'avance
 */
package com.project.models;


import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum GunFamily {

/*Type d'arme :  */

    LONG_BAREL("Canon long"),
    HAND_GUN("Arme de poing"),
    ;

    private final String name;
    
}
