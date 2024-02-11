/*-----Professional-----
 * Professionels du monde de l'armurerie
 */
package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Professional {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String adress;
    private String email;
    private int phone;
    private String webSite;
    
    @Enumerated(EnumType.STRING)
    private ProfessionalType professionalType;

    public Professional(String name, String description, String adress, String email, int phone, String webSite, ProfessionalType professionalType){
        this.name = name;
        this.description = description;
        this.adress = adress;
        this.email = email;
        this.phone = phone;
        this.webSite = webSite;
        this.professionalType = professionalType;
    }
    
}
