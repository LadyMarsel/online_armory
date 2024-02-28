package com.example.demo;

import com.example.demo.models.*;
import com.example.demo.repositories.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


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
        companyRepo.save(glock);
        
        Gun glock_17 = new Gun(glock, GunType.PISTOLET, FiringMode.SEMIAUTOMATIC, GunCaliber.C9, "Glock 17", "1980", "description", "URL d'img", false, false, 23, 40);
        gunRepo.save(glock_17);
        
        Gun glock_18 = new Gun(glock, GunType.PISTOLET, FiringMode.SEMIAUTOMATIC, GunCaliber.C9, "Glock 18", "1987", "description", "URL img", false, false, 25, 45);
        gunRepo.save(glock_18);
        
        Ammunition C9x19Para = new Ammunition("9x19 Parabellum", glock, GunCaliber.C9, "");
        amunitionRepo.save(C9x19Para);
        
        Member emilie = new Member("Emilie", "Flore", "emilie@hotmail.com", (long) 1234);
        memberRepo.save(emilie);
        
        Member michel = new Member("Michel", "Dupont", "michel@hotmail.com", (long) 1234);
        memberRepo.save(michel);

        License emLic = new License(emilie, "Emilie", null, LicenseType.M9_SPORT, List.of(GunType.PISTOLET));
        licenseRepo.save(emLic);
        
        Professional dekaise = new Professional("Armurerie Dekaise", "", "Zoning nord de Wavre", "dekaise@hotmail.be", 042, "www.dekaise.be", ProfessionalType.Armory);
        professionalRepo.save(dekaise);
    }
    
}
