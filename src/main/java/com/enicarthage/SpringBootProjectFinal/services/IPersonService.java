package com.enicarthage.SpringBootProjectFinal.services;

import java.util.List;

import com.enicarthage.SpringBootProjectFinal.entities.Person;

public interface IPersonService {
	public Person getperson(Long id);
	public Person saveperson(Person u);
	public Person updateperson(Person u);
	public void deleteperson(Person u);
	public void deletepersonById(Long id);
	
	public List<Person> getAllPersons();
}
