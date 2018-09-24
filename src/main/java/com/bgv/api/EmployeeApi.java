package com.bgv.api;

import com.bgv.model.Employee;

public interface EmployeeApi {

	public String saveProfile(Employee employeeInfo);
	
	public Employee getProfileById(String profileId);
}
