/*-----User-----
 * Membre du site
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
public class WSUser {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String role;
    private String email;
    private String password;

    @OneToMany
    private List<License> licenses;

    /*public WSUser(String firstName, String lastName, String userName, String role, String email, String pswd){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.role = role;
        this.email = email;
        this.pswd = pswd;
    }*/

    public WSUser(String username, String password, String role){
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
}
