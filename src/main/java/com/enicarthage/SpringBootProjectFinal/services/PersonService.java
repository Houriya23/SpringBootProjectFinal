package com.enicarthage.SpringBootProjectFinal.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.enicarthage.SpringBootProjectFinal.entities.Person;
import com.enicarthage.SpringBootProjectFinal.repositories.RoleRepository;
import com.enicarthage.SpringBootProjectFinal.repositories.PersonRepository;



@Service("personService")
@Transactional
public class PersonService implements IPersonService {
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private RoleRepository roleRepository;


	@Autowired
	public PersonService(PersonRepository personRepository, RoleRepository roleRepository) {
		this.personRepository = personRepository;
		this.roleRepository = roleRepository;
		
	}
	
	@Override
	public Person getperson(Long id) {
		return personRepository.findById(id).get() ;
	}

	@Override
	public Person saveperson(Person u) {
		return personRepository.save(u) ;
	}

	@Override
	public Person updateperson(Person u) {
		return personRepository.save(u) ;

	}

	@Override
	public void deleteperson(Person u) {
		personRepository.delete(u);		
	}

	@Override
	public void deletepersonById(Long id) {
		personRepository.deleteById(id);		
		
	}
	@Override 
	public List<Person> getAllPersons(){
		return (List<Person>) personRepository.findAll();
	}
	
}
