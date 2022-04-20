package com.enicarthage.SpringBootProjectFinal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "PATIENT")
public class Patient extends Person {

	@Column(name = "pname")
	@NotEmpty(message = "*Please provide your name")
	private String pName;

	@Column(name = "pdob")
	@NotEmpty(message = "*Please provide your date of birth")
	private String pDob;

	

	@Column(name = "padd")
	private String pAdd;
	
	@Column(name = "pmobile")
	private Long pMobileNo;

	

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getpName() {
		return pName;
	}



	public void setpName(String pName) {
		this.pName = pName;
	}



	public String getpDob() {
		return pDob;
	}



	public void setpDob(String pDob) {
		this.pDob = pDob;
	}



	public String getpAdd() {
		return pAdd;
	}



	public void setpAdd(String pAdd) {
		this.pAdd = pAdd;
	}



	public Long getpMobileNo() {
		return pMobileNo;
	}



	public void setpMobileNo(Long pMobileNo) {
		this.pMobileNo = pMobileNo;
	}

	

}
