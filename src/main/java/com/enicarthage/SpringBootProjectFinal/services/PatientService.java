package com.enicarthage.SpringBootProjectFinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.enicarthage.SpringBootProjectFinal.entities.Patient;
import com.enicarthage.SpringBootProjectFinal.entities.Person;
import com.enicarthage.SpringBootProjectFinal.repositories.PatientRepository;
import com.enicarthage.SpringBootProjectFinal.repositories.PersonRepository;
import com.enicarthage.SpringBootProjectFinal.repositories.RoleRepository;
@Service("patientService")
@Transactional
public class PatientService implements IPatientService {
	
	
	
	@Autowired
	private PatientRepository patientRepository;
	

	
	@Override 
	public List<Patient> getAllPatients(){
		return (List<Patient>) patientRepository.findAll();
	}
	

}
