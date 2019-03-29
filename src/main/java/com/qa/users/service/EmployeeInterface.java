package com.qa.users.service;

import com.qa.users.object.Employee;

public interface EmployeeInterface {
	
	public String createEmployee(Employee employee);
	public Employee readEmployee(long id);
	public String updateEmployeeRole(long id,String role);
	public String updateEmployeePassword(long id,String password);
	public String deleteEmployee(long id);

}
