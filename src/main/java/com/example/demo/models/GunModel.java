/*-----Gun Model-----
 * C'est le modèle d'une arme
 * Pour un modèle d'arme on a une marque, un type, un mode d'action, un ou plusieurs calibres
 */
package com.example.demo.models;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@NoArgsConstructor
public class GunModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private GunLabel gunLabel;//Marque

    @Enumerated(EnumType.STRING)
    private GunType gunType;//Type (Revolver, Pistolet, Carabine ou Fusil)
    
    @Enumerated(EnumType.STRING)
    private FireMode fireMode;//Mode d'ation

    @ManyToMany
    private List<GunCaliber> gunCalibers;//Calibre

    @ManyToMany
    private List<LicenseType> licenseTypes;//License néccéssaire à l'obtention de l'arme
    
    private String name;
    private String year;
    private String description;
    private String img;
    private boolean isForbidden;//Est-ce une arme prohibée en Belgique ?
    private boolean isFree;//Est-ce une arme en vente libre en Belgique ?
    
}
