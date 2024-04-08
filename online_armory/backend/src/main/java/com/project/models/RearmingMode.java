/*-----Firing Mode-----
 * C'est le mode de réarmement de munitions d'une arme
 * Exemple : 
 * AUTOMATIC("Automatic", ""), 
 * BURST(), 
 * SEMIAUTOMATIC("Semi Automatique", ""),
 * REPETITION(),
 * MONOCOUP(),
 * SIMPLEACTION("Simple action", ""),
 * DUALACTION("Double action", ""),
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
public class RearmingMode {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    @OneToMany
    private List<Gun> guns;
    
    public RearmingMode (String name, String description){
        this.name = name;
        this.description = description;
    }
}
