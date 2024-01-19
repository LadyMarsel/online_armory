package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CommandRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Coucou");
    }
    
}
