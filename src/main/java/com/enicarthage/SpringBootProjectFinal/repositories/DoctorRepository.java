package com.enicarthage.SpringBootProjectFinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.enicarthage.SpringBootProjectFinal.entities.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	// Medecin findByEmail (String email);
}
