package com.bgv.model;

import java.util.Date;

public class Employment {

	private boolean isFresher;
	private String companyName;
	private Address companyAddress;
	private String employeementType;
	private String designation;
	private Date dateOfJoining;
	private Date dateOfReleiving;
	private String employeeId;
	private String modeOfSeperation;
	private String comments;
	private boolean isPresentEmployment;
	private String lastSalaryPerAnnum;
	private Person reportingManager;
	private Person humarResoureManager;
	
	public boolean isFresher() {
		return isFresher;
	}
	public void setFresher(boolean isFresher) {
		this.isFresher = isFresher;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Address getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getEmployeementType() {
		return employeementType;
	}
	public void setEmployeementType(String employeementType) {
		this.employeementType = employeementType;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public Date getDateOfReleiving() {
		return dateOfReleiving;
	}
	public void setDateOfReleiving(Date dateOfReleiving) {
		this.dateOfReleiving = dateOfReleiving;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getModeOfSeperation() {
		return modeOfSeperation;
	}
	public void setModeOfSeperation(String modeOfSeperation) {
		this.modeOfSeperation = modeOfSeperation;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public boolean isPresentEmployment() {
		return isPresentEmployment;
	}
	public void setPresentEmployment(boolean isPresentEmployment) {
		this.isPresentEmployment = isPresentEmployment;
	}
	public String getLastSalaryPerAnnum() {
		return lastSalaryPerAnnum;
	}
	public void setLastSalaryPerAnnum(String lastSalaryPerAnnum) {
		this.lastSalaryPerAnnum = lastSalaryPerAnnum;
	}
	public Person getReportingManager() {
		return reportingManager;
	}
	public void setReportingManager(Person reportingManager) {
		this.reportingManager = reportingManager;
	}
	public Person getHumarResoureManager() {
		return humarResoureManager;
	}
	public void setHumarResoureManager(Person humarResoureManager) {
		this.humarResoureManager = humarResoureManager;
	}

	
}
