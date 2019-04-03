package com.qa.users.service;

import com.qa.users.object.Employee;

public interface EmployeeInterface {
	
	public String createEmployee(Employee employee);
	public Employee readEmployee(String email);
	public String updateEmployeeRole(String email,String role);
	public String updateEmployeePassword(String email,String password);
	public String deleteEmployee(String email);

}
