/*-----Firing Mode-----
 * C'est le mode d'action de la mise à feu des munitions
 * C'est une énumération car il n'y a pas de nouvelles données à mettre une fois l'app lancée, la donnée est fixée d'avance
 */
package com.project.models;


import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum FiringMode {

/* Modes d'action : */

    AUTOMATIC("Automatic", ""),
    SEMIAUTOMATIC("Semi Automatique", ""),
    SIMPLEACTION("Simple action", ""),
    DUALACTION("Double action", ""),
    MIXTE("Action mixte", ""),
    SELECTIONNALBE("Mode séléctionnable", ""),
    ;

    private final String name;
    private final String description;
    
}
