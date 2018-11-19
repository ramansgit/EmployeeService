package com.bgv.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@DynamoDBDocument
@JsonInclude(Include.NON_NULL)
public class Person {
	private String name;
	private String email;
	private String mobile;
	private String designation;

	public Person() {

	}

	public Person(String name, String email, String mobile, String designation) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
