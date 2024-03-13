/*-----Professional-----
 * Professionels du monde de l'armurerie
 */
package com.project.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Professionnal {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String country;
    private String year;
    private String description;
    private String adress;
    private String email;
    private int phone;
    private String webSite;
    
    @Enumerated(EnumType.STRING)
    private ProfessionnalType professionnalType;

    public Professionnal(String name, String country, String year,String description, String adress, String email, int phone, String webSite, ProfessionnalType professionnalType){
        this.name = name;
        this.country = country;
        this.year = year;
        this.description = description;
        this.adress = adress;
        this.email = email;
        this.phone = phone;
        this.webSite = webSite;
        this.professionnalType = professionnalType;
    }
    
}
