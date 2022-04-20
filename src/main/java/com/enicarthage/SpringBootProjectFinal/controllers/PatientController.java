package com.enicarthage.SpringBootProjectFinal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enicarthage.SpringBootProjectFinal.entities.Patient;
import com.enicarthage.SpringBootProjectFinal.entities.Person;
import com.enicarthage.SpringBootProjectFinal.repositories.DoctorRepository;
import com.enicarthage.SpringBootProjectFinal.repositories.PatientRepository;
import com.enicarthage.SpringBootProjectFinal.repositories.PersonRepository;
import com.enicarthage.SpringBootProjectFinal.services.IPersonService;
import com.enicarthage.SpringBootProjectFinal.services.PatientService;
import com.enicarthage.SpringBootProjectFinal.services.PersonService;

@RestController
@RequestMapping({ "/patient" })
@CrossOrigin(origins="http://localhost:4200")
public class PatientController {
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired 
	private PatientService patientService;
	
	@GetMapping("/list")
	public List<Patient> getAllPatients() {
		List<Patient> patients = patientRepository.findAll();
		patients.forEach((user)->{
			
		});
		return patients;
	}
}
