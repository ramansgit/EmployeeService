package com.bgv.model;

import java.util.Date;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@DynamoDBDocument
@JsonInclude(Include.NON_NULL)
public class Education {

	public Education() {

	}

	public Education(String name, String university, String rollNo, Date dateFrom, Date dateTo, String score,
			String modeOfStudy, Address educationAddress) {
		super();
		this.name = name;
		this.university = university;
		this.rollNo = rollNo;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.score = score;
		this.modeOfStudy = modeOfStudy;
		this.educationAddress = educationAddress;
	}

	private String name;
	private String university;
	private String rollNo;
	private Date dateFrom;
	private Date dateTo;
	private String score;
	private String modeOfStudy;
	private Address educationAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getModeOfStudy() {
		return modeOfStudy;
	}

	public void setModeOfStudy(String modeOfStudy) {
		this.modeOfStudy = modeOfStudy;
	}

	public Address getEducationAddress() {
		return educationAddress;
	}

	public void setEducationAddress(Address educationAddress) {
		this.educationAddress = educationAddress;
	}
}
