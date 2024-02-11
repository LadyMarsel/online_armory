/*-----Gun-----
 * C'est le modèle d'une arme
 * Pour un modèle d'arme on a une marque, un type, un mode d'action, un ou plusieurs calibres
 */
package com.example.demo.models;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@NoArgsConstructor
public class Gun {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private Company company;//Marque

    @Enumerated(EnumType.STRING)
    private GunType gunType;//Type (Revolver, Pistolet, Carabine ou Fusil)
    
    @Enumerated(EnumType.STRING)
    private FiringMode firingMode;//Mode de mise à feu

    @Enumerated(EnumType.STRING)
    private GunCaliber gunCaliber;//Calibre

    //@OneToMany
    //private LicensePaper licensePaper;//License néccéssaire à l'obtention de l'arme. Certaines armes s'obtiennent avec différentes licenses
    
    private String name;
    private String year;
    private String description;
    private String img;
    private boolean isForbidden;//Est-ce une arme prohibée en Belgique ?
    private boolean isFree;//Est-ce une arme en vente libre en Belgique ?
    private int barelSize;//Taille du canon
    private int totalSize;//Taille totale

    public Gun(Company company, GunType gunType, FiringMode firingMode, GunCaliber gunCaliber, String name, String year, String description, String img, boolean isForbidden, boolean isFree, int barelSize, int totalSize){
        this.company = company;
        this.gunType = gunType;
        this.firingMode = firingMode;
        this.gunCaliber = gunCaliber;
        this.name = name;
        this.year = year;
        this.description = description;
        this.img = img;
        this.isForbidden = isForbidden;
        this.isFree = isFree;
        this.barelSize = barelSize;
        this.totalSize = totalSize;
    }
    
}
