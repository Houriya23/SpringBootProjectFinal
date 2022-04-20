package com.enicarthage.SpringBootProjectFinal.repositories;

import java.util.Optional;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enicarthage.SpringBootProjectFinal.entities.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	
}
