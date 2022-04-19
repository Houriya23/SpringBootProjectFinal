package com.enicarthage.SpringBootProjectFinal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class Patient extends User {

	@Column(name = "first_name")
	@NotEmpty(message = "*Please provide your firstname")
	private String firstName;

	@Column(name = "last_name")
	@NotEmpty(message = "*Please provide your last name")
	private String lastName;

	@Column(name = "phone")
	private Long phoneNumber;

	@Column(name = "address")
	private String address;

	@Column(name = "ville")
	private String ville;

	@Column(name = "sexe")
	private String sexe;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getSexe() {
		return sexe;
	}

}
