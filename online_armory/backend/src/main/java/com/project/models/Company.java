/*-----Company-----
 * C'est la marque des armes et des munitions
 */
package com.project.models;

import java.util.List;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Company {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String year;

    //Un fab ricant à un seul pays
    @ManyToOne
    private Country country; 

    private String description;
    private String logo;

    @OneToMany
    private List<Gun> guns;

    @OneToMany
    private List<Ammunition> ammunitions;
    
    public Company(String name, String year, Country country, String description, String logo){
        this.name = name;
        this.year = year;
        this.country = country;
        this.description = description;
        this.logo = logo;
    }

}
