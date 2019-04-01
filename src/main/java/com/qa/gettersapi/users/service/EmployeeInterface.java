package com.qa.gettersapi.users.service;

import com.qa.gettersapi.users.object.Employee;

public interface EmployeeInterface {
	
	public String createEmployee(Employee user);
	public Employee readEmployee(long id);
	public String updateRole(long id,String role);
	public String updatePassword(long id,String password);
	public String deleteEmployee(long id);

}
