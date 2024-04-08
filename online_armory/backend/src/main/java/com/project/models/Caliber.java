/*-----Gun Caliber-----
 * Calibre des armes, en système métrique et en système de pouce
 * Exemple
 * 9 milliètre
 * 22 long rifle
 */
package com.project.models;

import java.util.List;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Caliber {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String inch;
    private String metric;
    
    @ManyToMany
    private List<LicenseType> licenseTypes;

    @OneToMany
    private List<Gun> guns;

    @OneToMany
    private List<Ammunition> ammunitions;

    public Caliber (String inch, String metric){
        this.inch = inch;
        this.metric = metric;
    }
    
}
