package com.bgv.model;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@DynamoDBDocument
@JsonInclude(Include.NON_NULL)
public class Employee {

	public Employee() {

	}

	public Employee(Personal personal, List<Address> address, List<Education> education, List<Employment> employment,
			List<Reference> reference) {
		super();
		this.personal = personal;
		this.address = address;
		this.education = education;
		this.employment = employment;
		this.reference = reference;
	}

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
