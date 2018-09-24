package com.bgv.model;

import java.util.List;

public class Employee {

	private Personal personal;
	private List<Address> address;
	private List<Education> education;
	private List<Employment> employment;
	private List<Reference> reference;
	
	public Personal getPersonal() {
		return personal;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<Education> getEducation() {
		return education;
	}
	public void setEducation(List<Education> education) {
		this.education = education;
	}
	public List<Employment> getEmployment() {
		return employment;
	}
	public void setEmployment(List<Employment> employment) {
		this.employment = employment;
	}
	public List<Reference> getReference() {
		return reference;
	}
	public void setReference(List<Reference> reference) {
		this.reference = reference;
	}
}
