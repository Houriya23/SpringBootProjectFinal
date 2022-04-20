package com.enicarthage.SpringBootProjectFinal.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Doctor extends Person {

	@Column(name = "DOC_NAME")
	@NotEmpty(message = "*Please provide your name")
	private String doctorName;

	@Column(name = "DOC_ADDRESS")
	private String doctorAddress;

	@Column(name = "PHONE_NO")
	private long doctorPhoneNO;

	

	@OneToOne
	@JoinColumn(name = "SPEC_ID")
	private Specialization specialization;
	

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getDoctorAddress() {
		return doctorAddress;
	}


	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}


	public long getDoctorPhoneNO() {
		return doctorPhoneNO;
	}


	public void setDoctorPhoneNO(long doctorPhoneNO) {
		this.doctorPhoneNO = doctorPhoneNO;
	}


	public Specialization getSpecialization() {
		return specialization;
	}


	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}

	

}
