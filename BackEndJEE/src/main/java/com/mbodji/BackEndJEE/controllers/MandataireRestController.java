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

import com.mbodji.BackEndJEE.entities.Mandataire;
import com.mbodji.BackEndJEE.repository.MandataireRepository;

@RestController
@CrossOrigin
@RequestMapping("/api3")
public class MandataireRestController {
	
	@Autowired
	MandataireRepository mandataireRepository;
	
	@GetMapping
	public List<Mandataire> getAllMan(){
		return mandataireRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Mandataire getManById(@PathVariable("id") Long id) {
		return mandataireRepository.findById(id).get();
	}
	@PostMapping
	public Mandataire createMan(@RequestBody Mandataire mandataire) {
		return mandataireRepository.save(mandataire);
	}
	@PutMapping("/{id}")
	public Mandataire replaceMan(@PathVariable("id") Long id, @RequestBody Mandataire mandataire) {
		Mandataire man=mandataireRepository.findById(id).get();
		man.setAdresseMandataire(mandataire.getAdresseMandataire());
		man.setCiviliteMandataire(mandataire.getCiviliteMandataire());
		man.setCompteDeMandataire(mandataire.getCompteDeMandataire());
		man.setDenominationMandataire(mandataire.getDenominationMandataire());
		man.setEntrepriseMandataire(mandataire.getEntrepriseMandataire());
		man.setFonctionMandataire(mandataire.getFonctionMandataire());
		man.setTypeMandatMandataire(mandataire.getTypeMandatMandataire());
		
		return mandataireRepository.save(mandataire);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMan(@PathVariable("id") Long id) {
		mandataireRepository.deleteById(id);
	}
	

}
