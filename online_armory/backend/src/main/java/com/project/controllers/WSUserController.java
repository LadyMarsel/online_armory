package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.models.WSUser;
import com.project.services.WSUserService;

@CrossOrigin
@RestController
public class WSUserController {

    @Autowired
    private WSUserService WSUserService;

    /* Read - Get all */
    
    @GetMapping("/users")
    public Iterable<WSUser> getWSUsers(){
        return WSUserService.getWSUsers();
    }

    /* Read - Get one if it exist */

    @GetMapping("/user/{id}")
    public WSUser getWSUser(@PathVariable("id") final Long id){
        Optional<WSUser> user = WSUserService.getWSUser(id);
        if(user.isPresent()){
            return user.get();
        }else{
            return null;
        }
    }

    /* Create - Create one */

    @PostMapping("/user")
    public WSUser createWSUser(@RequestBody WSUser WSUser){
        return WSUserService.saveWSUser(WSUser);
    }

    /* Update - Update an existing */

    @PutMapping("/user/{id}")
    public WSUser updateWSUser(@PathVariable("id") final Long id, @RequestBody WSUser WSUser){
        Optional<WSUser> m = WSUserService.getWSUser(id);
        if(m.isPresent()){
            WSUser currentWSUser = m.get();

            /*String firstName = WSUser.getFirstName();
            if(firstName != null){
                currentWSUser.setFirstName(firstName);
            }

            String lastName = WSUser.getLastName();
            if(lastName != null){
                currentWSUser.setLastName(lastName);
            }

            String email = WSUser.getEmail();
            if(email != null){
                currentWSUser.setEmail(email);
            }*/

            String username = WSUser.getUsername();
            if(username != null){
                currentWSUser.setUsername(username);
            }

            String role = WSUser.getRole();
            if(role != null){
                currentWSUser.setRole(role);
            }

            String password = WSUser.getPassword();
            if(password != null){
                currentWSUser.setPassword(password);
            }

            WSUserService.saveWSUser(currentWSUser);
            return currentWSUser;

        } else {
            return null;
        }
    }

    /* Delete - Delete one */

    @DeleteMapping("/user/{id}")
    public void deleteWSUser(@PathVariable("id") final Long id){
        WSUserService.deleteWSUser(id);
    }

}