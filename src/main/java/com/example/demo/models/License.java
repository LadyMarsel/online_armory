
/*-----License-----
 * C'est un permis, liant un membre à une arme ou à une catégorie d'arme.
 * Une license s'obtient après des tests, examen et délivrances de documents administratifs/médicaux
 * Une license est liée à la fois à un modèle et à des catégories d'arme
 * 
 * Par exemlpe : 
 * J'ai un modèle 4, j'ai donc accès à une liste d'arme
 * J'ai un modèle 9 sport, avec uniquement la catégorie A dessus, j'ai accès à une autre liste d'arme
 */
package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class License {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private Member member;
    
    private String name;
    
    @Temporal(TemporalType.DATE)
    private Date dateOfValidity;
    
    @Enumerated(EnumType.STRING)
    private LicenseType licenseType; //Le papier sur lequel on base la séléction d'arme dispo
    
    @OneToMany
    private List<GunType> gunType;//Les catégories législatives mentionées éventuelement sur la license, filtre supplémentaire

    public License(Member member, String name, Date dateOfValidity, LicenseType licenseType, List<GunType> gunType){
        this.member = member;
        this.name = name;
        this.dateOfValidity = dateOfValidity;
        this.licenseType = licenseType;
        this.gunType = gunType;
    }
}
