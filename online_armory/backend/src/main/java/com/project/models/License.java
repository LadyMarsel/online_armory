
/*-----License-----
 * C'est un document.
 * Il lie un membre à une arme ou à une catégorie d'armes,
 * En fonction du calibre (Lien avec LicenseType),
 * Et de catégories (Lien avec GunType).
 * Il possède une date de validité.
 * 
 * Un Membre peut posséder plusieurs licenses, mais une license n'a qu'un seul propriétaire
 * 
 * Par exemlpe : 
 * J'ai un modèle 4, 
 * j'ai donc accès à une liste d'arme prédéfinie 
 * J'ai un modèle 9 sport, avec uniquement la catégorie A dessus, 
 * j'ai accès à une autre liste d'arme, de catégorie A uniquement et calibre 22'
 */
package com.project.models;

import java.util.Date;
import java.util.List;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class License {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    //Une license n'a qu'un seul membre, mais un membre peut avoir plusieurs licenses
    @ManyToOne
    private WSUser WSUser;
    
    @Temporal(TemporalType.DATE)
    private Date dateOfValidity;
    
    @ManyToOne
    private LicenseType licenseType; //Le papier sur lequel on base la séléction d'arme dispo et qui reprend les calibres
    
    //Classe associative  néccéssaire : Une license peut contenir plusieurs type d'arme, et un type d'arme peut être repris par plusieurs licenses
    @ManyToMany
    private List<GunType> gunTypes;//Les catégories législatives mentionées éventuelement sur la license, filtre supplémentaire

    public License(WSUser WSUser, Date dateOfValidity, LicenseType licenseType){
        this.WSUser = WSUser;
        this.dateOfValidity = dateOfValidity;
        this.licenseType = licenseType;
    }
}
