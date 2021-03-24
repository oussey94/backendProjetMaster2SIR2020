package com.mbodji.BackEndJEE.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbodji.BackEndJEE.entities.Contribuable;
import com.mbodji.BackEndJEE.repository.ContribuableRepository;

@RestController
@CrossOrigin
@RequestMapping("/api1")
public class ContribuableRestController {
	@Autowired
	private ContribuableRepository contribuableRepository;
	
	@GetMapping
	public List<Contribuable> getAllContrib(){
		return contribuableRepository.findAll();
		
	}
	
	@PostMapping
	public Contribuable createContribuable(@RequestBody Contribuable contribuable) {
		
		return contribuableRepository.save(contribuable);
	}

}
