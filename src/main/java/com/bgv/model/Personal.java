package com.bgv.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@DynamoDBDocument
@JsonInclude(Include.NON_NULL)
public class Personal {

	public Personal() {

	}

	public Personal(String profilePicUrl, String name, String fatherName, String gender, String email, String mobile,
			String dob, String martialStatus, String nationality, String aadharNo) {
		super();
		this.profilePicUrl = profilePicUrl;
		this.name = name;
		this.fatherName = fatherName;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
		this.martialStatus = martialStatus;
		this.nationality = nationality;
		this.aadharNo = aadharNo;
	}

	private String profilePicUrl;
	private String name;
	private String fatherName;
	private String gender;
	private String email;
	private String mobile;
	private String dob;
	private String martialStatus;
	private String nationality;
	private String aadharNo;

	public String getProfilePicUrl() {
		return profilePicUrl;
	}

	public void setProfilePicUrl(String profilePicUrl) {
		this.profilePicUrl = profilePicUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
}
