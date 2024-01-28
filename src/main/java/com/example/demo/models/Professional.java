/*-----Professional-----
 * Professionels du monde de l'armurerie
 */
package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private Long phone;
    private String webSite;
    
    @Enumerated(EnumType.STRING)
    private ProfType profType;

    
}
