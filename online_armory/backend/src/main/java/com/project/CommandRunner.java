package com.project;

import com.project.repositories.*;
import com.project.models.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;


@Component
public class CommandRunner implements CommandLineRunner {
    /*
    @Autowired
    private AmmunitionRepository amunitionRepo;

    @Autowired 
    private CompanyRepository companyRepo;

    @Autowired//injection de valeur
    private GunRepository gunRepo;

    @Autowired 
    private LicenseRepository licenseRepo;

    @Autowired
    private MemberRepository memberRepo;

    @Autowired 
    private ProfessionnalRepository professionnalRepo;

    @Autowired
    private CaliberRepository caliberRepository;
    */
    @Override
    public void run(String... args) throws Exception{
  
        /*Company glock = new Company("Glock", "1963", "Autriche", "ceci est une scription", "url d'un img");
        companyRepo.save(glock);
        
        Gun glock_17 = new Gun(glock, "Pistolet"", "Semi-automatique", 9, "Glock 17", "Allemagne", "1980", "description", "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.sportsmansoutdoorsuperstore.com%2Fprodimages%2Falt_images%2Fg17-gen5-fs_2.jpg&f=1&nofb=1&ipt=cd538ae34b49d4b299d0624df71bbcf569878b78fe918eeb03e2c4f6a03cd786&ipo=images", false, false, (int) 23, (int) 40);
        gunRepo.save(glock_17);
        
        Gun glock_18 = new Gun(glock, GunType.PISTOLET, RearmingMode.SEMIAUTOMATIC, Caliber.C9, "Glock 18", "Allemagne", "1987", "description", "URL img", false, false, (int) 25, (int) 45);
        gunRepo.save(glock_18);
        
        Caliber C9 = new Caliber("", "9");

        Ammunition C9x19Para = new Ammunition("9x19 Parabellum", glock, C9, "description", "cecie est une img");
        amunitionRepo.save(C9x19Para);
        
        Member emilie = new Member("Emilie", "Flore", "emilie@hotmail.com", (long) 1234);
        memberRepo.save(emilie);
        
        Member michel = new Member("Michel", "Dupont", "michel@hotmail.com", (long) 1234);
        memberRepo.save(michel);

        License emLic = new License(emilie, "Emilie", null, LicenseType.M9_SPORT, List.of(GunType.PISTOLET));
        licenseRepo.save(emLic);
        
        Professionnal dekaise = new Professionnal("Armurerie Dekaise", "belgique", "Zoning nord de Wavre", "dekaise@hotmail.be", "adresse", "email", 042, "www.dekaise.be", ProfessionnalType.Armory);
        professionnalRepo.save(dekaise);
    */}
    
}
