package com.enicarthage.SpringBootProjectFinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enicarthage.SpringBootProjectFinal.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{
	//Patient findByEmail (String email);
}
