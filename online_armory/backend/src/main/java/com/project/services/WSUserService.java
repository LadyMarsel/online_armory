package com.project.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;*/
import org.springframework.stereotype.Service;

import com.project.models.WSUser;
import com.project.repositories.WSUserRepository;

@Service
public class WSUserService /*implements UserDetailsService*/ {

    @Autowired
    private WSUserRepository WSUserRepository;

    /*@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        WSUser WSUser = WSUserRepository.findByUsername(username);

        return new User(WSUser.getUsername(), WSUser.getPassword(), getGrantedAuthorities(WSUser.getRole()));
    }

    private List<GrantedAuthority> getGrantedAuthorities(String role){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        return authorities;
    }

    /* Read - Get one if it exist */
    
    public Optional<WSUser> getWSUser(final Long id){
        return WSUserRepository.findById(id);
    }

    /* Read - Get all */

    public Iterable<WSUser> getWSUsers(){
        return WSUserRepository.findAll();
    }

    /* Delete - Delete one */

    public void deleteWSUser(final Long id){
        WSUserRepository.deleteById(id);
    }
    
    /* Create || Save - Create || Save one */

    public WSUser saveWSUser(WSUser WSUser){
        WSUser savedWSUser = WSUserRepository.save(WSUser);
        return savedWSUser;
    }


    
}
