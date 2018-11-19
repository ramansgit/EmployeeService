package com.bgv.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@DynamoDBDocument
@JsonInclude(Include.NON_NULL)
public class Reference {

	public Reference() {
		
	}
	public Reference(String name, String designation, String companyName, String emailId) {
		super();
		this.name = name;
		this.designation = designation;
		this.companyName = companyName;
		this.emailId = emailId;
	}
	private String name;
	private String designation;
	private String companyName;
	private String emailId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
