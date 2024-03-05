/*-----Member-----
 * Membre du site
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
public class Member {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Long pswd;

    public Member(String firstName, String lastName, String email, Long pswd){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pswd = pswd;
    }
    
}
