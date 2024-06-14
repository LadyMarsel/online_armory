/*-----Gun-----
 * C'est le modèle d'une arme
 * Pour un modèle d'arme on a une marque, un type, un mode d'action, un ou plusieurs calibres
 */
package com.project.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Gun {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    //Un gun ne peut avoir qu'un seul fabricant, mais un fabriquant peut avoir plusieurs modèles
    @ManyToOne
    private Company company;//Fabricant

    //Un gun ne peut avoir qu'un seul type, mais un type peut être décliné en plusieurs modèles
    @ManyToOne
    private GunType gunType;//Revolver, Pistolet, Carabine ou Fusil

    //Un gun ne peut avoir qu'un seul mode de réarmement, mais un mode de réarmement peut être décliné en plusieurs modèles
    @ManyToOne
    private RearmingMode rearmingMode;//Mode de réarmement de l'arme

    @ManyToOne
    private InternalMechanic internalMechanic;

    //Un gun ne peut avoir qu'un seul calibre, mais un calibre peut être utilisé par plusieurs modèles
    @ManyToOne
    private Caliber caliber;//Calibre
    private String name;

    private String year;
    private String description;
    private String img;
    private boolean forbidden;//Est-ce une arme prohibée en Belgique ?
    private boolean free;//Est-ce une arme en vente libre en Belgique ?
    private int barelSize;//Taille du canon
    private int totalSize;//Taille totale

    public Gun(Company company, GunType gunType, RearmingMode rearmingMode, Caliber caliber, String name, String year, String description, String img, boolean forbidden, boolean free, int barelSize, int totalSize){
        this.company = company;
        this.gunType = gunType;
        this.rearmingMode = rearmingMode;
        this.caliber = caliber;
        this.name = name;
        this.year = year;
        this.description = description;
        this.img = img;
        this.forbidden = forbidden;
        this.free = free;
        this.barelSize = barelSize;
        this.totalSize = totalSize;
    }

    
    
}
