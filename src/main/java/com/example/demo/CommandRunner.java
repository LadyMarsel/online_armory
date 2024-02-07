package com.example.demo;

import com.example.demo.models.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.repositories.AmunitionRepository;
import com.example.demo.repositories.CompanyRepository;
import com.example.demo.repositories.GunRepository;
import com.example.demo.repositories.LicenseRepository;
import com.example.demo.repositories.MemberRepository;
import com.example.demo.repositories.ProfessionalRepository;

@Component
public class CommandRunner implements CommandLineRunner {
    
    @Autowired
    private AmunitionRepository amunitionRepo;

    @Autowired 
    private CompanyRepository companyRepo;

    @Autowired//injection de valeur
    private GunRepository gunRepo;

    @Autowired 
    private LicenseRepository licenseRepo;

    @Autowired
    private MemberRepository memberRepo;

    @Autowired 
    private ProfessionalRepository professionalRepo;
    
    @Override
    public void run(String... args) throws Exception{
        System.out.println("Coucou");
        
        Company glock = new Company("Glock", "1963", "Autriche", "", "");
        Gun glock_17 = new Gun(glock, GunType.PISTOLET, FiringMode.SEMIAUTOMATIC, null, "Glock 17", "1980", "", "", false, false);
        Gun glock_18 = new Gun(glock, GunType.PISTOLET, FiringMode.SEMIAUTOMATIC, null, "Glock 18", "1987", "", "", false, false);
        Ammunition C9x19Para = new Ammunition("9x19 Parabellum", glock, null, "");
        Member emilie = new Member("Emilie", "Flore", "emilie@hotmail.com", 1234);
        License emLic = new License(emilie, "Emilie", null, LicensePaper.M9_SPORT, List.of(GunType.PISTOLET));
        Professional dekaise = new Professional("Armurerie Dekaise", "", "Zoning nord de Wavre", "dekaise@hotmail.be", 042, "www.dekaise.be", ProfType.Armory);
    }
    
}
