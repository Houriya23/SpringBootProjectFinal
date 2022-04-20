package com.enicarthage.SpringBootProjectFinal.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enicarthage.SpringBootProjectFinal.entities.Doctor;
import com.enicarthage.SpringBootProjectFinal.entities.Person;
import com.enicarthage.SpringBootProjectFinal.repositories.DoctorRepository;
import com.enicarthage.SpringBootProjectFinal.repositories.PersonRepository;
import com.enicarthage.SpringBootProjectFinal.services.IPersonService;
import com.enicarthage.SpringBootProjectFinal.services.PersonService;



@RestController
@RequestMapping({ "/persons" })
//@CrossOrigin(origins = "*")
public class PersonController {
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private IPersonService ipersonservice;
	
	@Autowired 
	private PersonService personService;
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	
	/*
	@GetMapping("/{personId}")
	public Person getAllUser(@PathVariable Long personId) {		
		Optional<Person> p = personRepository.findById(personId);
		return p.get();
	}
	
	@GetMapping("medecin/{userId}")
	public Medecin getyMedecinById(@PathVariable Long userId) {		
		Optional<Medecin> p = medecinRepository.findById(userId);
		return p.get();
	}
	*/
	@GetMapping("/list")
	public List<Person> getAllPersons() {
		List<Person> persons = personRepository.findAll();
		persons.forEach((user)->{
			
		});
		return persons;
	}
	
	/*
	
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
		
		return userRepository.findById(userId).map(user -> {
			
			userRepository.delete(user);

			 
			return ResponseEntity.ok().body("User "+userId+" has been deleted");
		}).orElseThrow(() -> new IllegalArgumentException("userId " + userId + " not found"));
	}  
	*/
	
}
