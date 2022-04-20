package com.enicarthage.SpringBootProjectFinal.services;

import java.util.List;

import com.enicarthage.SpringBootProjectFinal.entities.Patient;

public interface IPatientService {
	public List<Patient> getAllPatients();
	public Patient getpatient(Long id);
}
