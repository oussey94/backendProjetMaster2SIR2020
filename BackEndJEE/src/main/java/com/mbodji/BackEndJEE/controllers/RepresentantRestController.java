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

import com.mbodji.BackEndJEE.entities.Representant;
import com.mbodji.BackEndJEE.repository.RepresentantRepository;

@RestController
@CrossOrigin
@RequestMapping("/api2")
public class RepresentantRestController {
	@Autowired
	RepresentantRepository representantRepository;
	
	@GetMapping
	public List<Representant> getAllRep(){
		return representantRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Representant getRepById(@PathVariable("id") Long id) {
		return representantRepository.findById(id).get();
	}
	
	@PostMapping
	public Representant createRep(@RequestBody Representant representant) {
		return representantRepository.save(representant);
	}
	
	@PutMapping("/{id}")
    public Representant replaceRep(@PathVariable("id") Long id, @RequestBody Representant representant) {
    	Representant rep=representantRepository.findById(id).get();
    	rep.setCiviliteRepresentant(representant.getCiviliteRepresentant());
    	rep.setEmailRepresentant(representant.getEmailRepresentant());
    	rep.setFonctionRepresentant(representant.getFonctionRepresentant());
    	rep.setHabilitationRepresentant(representant.getHabilitationRepresentant());
    	rep.setNomRepresentant(representant.getNomRepresentant());
    	rep.setPrenomRepresentant(representant.getPrenomRepresentant());
    	rep.setPosteRepresentant(representant.getPosteRepresentant());
    	rep.setTelephoneFixeRepresentant(representant.getTelephoneFixeRepresentant());
    	rep.setTelephoneMobileRepresentant(representant.getTelephoneMobileRepresentant());
    	return representantRepository.save(representant);
    }
	
	@DeleteMapping("/{id}")
	public void deleteRep(@PathVariable("id") Long id) {
		representantRepository.deleteById(id);
	}
    
}


