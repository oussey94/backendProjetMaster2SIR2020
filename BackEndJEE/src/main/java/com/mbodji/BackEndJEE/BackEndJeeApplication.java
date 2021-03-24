package com.mbodji.BackEndJEE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.representer.Represent;

import com.mbodji.BackEndJEE.entities.Contribuable;
import com.mbodji.BackEndJEE.entities.Mandataire;
import com.mbodji.BackEndJEE.entities.ReferenceBancaire;
import com.mbodji.BackEndJEE.entities.Representant;
import com.mbodji.BackEndJEE.repository.ContribuableRepository;
import com.mbodji.BackEndJEE.repository.MandataireRepository;
import com.mbodji.BackEndJEE.repository.ReferenceBancaireRepository;
import com.mbodji.BackEndJEE.repository.RepresentantRepository;

@SpringBootApplication
public class BackEndJeeApplication implements CommandLineRunner {
	@Autowired
	ContribuableRepository contribuableRepository;
	
	@Autowired
	RepresentantRepository representantRepository;
	
	@Autowired
	MandataireRepository mandataireRepository;
	
	@Autowired
	ReferenceBancaireRepository referenceBancaireRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackEndJeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*contribuableRepository.save(new Contribuable( "oussey","mbodji","céliba","dévv","mbodji@gmail.com",778291154,"BISS",
	    "DevOps",54,"avenu","Abrahamm","ibouuu","Tefess","Somone",23000,030,22,"moyen Entr DK")); */
		
		/*representantRepository.save(new Representant("baba","diakha","céli","comptable","diakha@gmail.com",
				337689900,24000,779008866,"teledeclaration"));*/
		
		/*mandataireRepository.save(new Mandataire("Mme","Safietou","GRH","BOAA","Somone",
				"BOAA","Telepaiment"));*/
		
		//referenceBancaireRepository.save(new ReferenceBancaire("BNP Paris BAS","SN24",15436,98765432,243));
		
	}

}
