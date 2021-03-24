package com.mbodji.BackEndJEE.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mbodji.BackEndJEE.entities.ReferenceBancaire;
import com.mbodji.BackEndJEE.repository.ReferenceBancaireRepository;

@RestController
@CrossOrigin
@RequestMapping("/api4")
public class ReferenceBancaireRestController {
	
	@Autowired
	ReferenceBancaireRepository referenceBancaireRepository;
	
	@GetMapping
	public List<ReferenceBancaire> getAllRef(){
		return referenceBancaireRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ReferenceBancaire getRefById(@PathVariable("id") Long id) {
		return referenceBancaireRepository.findById(id).get();
	}
	@PostMapping
	public ReferenceBancaire createRef(@RequestBody ReferenceBancaire referenceBancaire) {
		return referenceBancaireRepository.save(referenceBancaire);
	}
	@PutMapping("/{id}")
	public ReferenceBancaire replaceRef(@PathVariable("id") Long id, @RequestBody ReferenceBancaire referenceBancaire) {
		ReferenceBancaire ref=referenceBancaireRepository.findById(id).get();
		ref.setBanqueReferenceBancaire(referenceBancaire.getBanqueReferenceBancaire());
		ref.setCleReferenceBancaire(referenceBancaire.getCleReferenceBancaire());
		ref.setCodeBanqueReferenceBancaire(referenceBancaire.getBanqueReferenceBancaire());
		ref.setCodeguichetReferenceBancaire(referenceBancaire.getCodeguichetReferenceBancaire());
		ref.setNumCompteReferenceBancaire(referenceBancaire.getNumCompteReferenceBancaire());
		
		
		return referenceBancaireRepository.save(referenceBancaire);
	}
	
	@DeleteMapping("/{id}")
	public void deleteRef(@PathVariable("id") Long id) {
		referenceBancaireRepository.deleteById(id);
	}

}
