package com.bgv.model;

import java.util.Date;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@DynamoDBDocument
@JsonInclude(Include.NON_NULL)
public class Address {

	public Address() {

	}

	public Address(String street, String doorno, String addressType, String city, String state, String country,
			String pincode, String landmark, Date fromDate, Date toDate, String mobile) {
		super();
		this.street = street;
		this.doorno = doorno;
		this.addressType = addressType;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.landmark = landmark;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.mobile = mobile;
	}

	private String street;
	private String doorno;
	private String addressType;
	private String city;
	private String state;
	private String country;
	private String pincode;
	private String landmark;
	private Date fromDate;
	private Date toDate;
	private String mobile;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDoorno() {
		return doorno;
	}

	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
