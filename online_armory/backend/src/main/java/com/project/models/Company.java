/*-----Company-----
 * C'est la marque des armes et des munitions
 */
package com.project.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Company {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String year;
    private String country; 
    private String description;
    private String logo;
    
    public Company(String name, String year, String country, String description, String logo){
        this.name = name;
        this.year = year;
        this.country = country;
        this.description = description;
        this.logo = logo;
    }
}
