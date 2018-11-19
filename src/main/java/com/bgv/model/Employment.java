package com.bgv.model;

import java.util.Date;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@DynamoDBDocument
@JsonInclude(Include.NON_NULL)
public class Employment {
	public Employment() {
		
	}
	public Employment(boolean isFresher, String companyName, Address companyAddress, String employeementType,
			String designation, Date dateOfJoining, Date dateOfReleiving, String employeeId, String modeOfSeperation,
			String comments, boolean isPresentEmployment, String lastSalaryPerAnnum, Person reportingManager,
			Person humarResoureManager) {
		super();
		this.isFresher = isFresher;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.employeementType = employeementType;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
		this.dateOfReleiving = dateOfReleiving;
		this.employeeId = employeeId;
		this.modeOfSeperation = modeOfSeperation;
		this.comments = comments;
		this.isPresentEmployment = isPresentEmployment;
		this.lastSalaryPerAnnum = lastSalaryPerAnnum;
		this.reportingManager = reportingManager;
		this.humarResoureManager = humarResoureManager;
	}
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
