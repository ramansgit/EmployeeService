package com.bgv.model;

import java.util.Date;

public class Education {

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
