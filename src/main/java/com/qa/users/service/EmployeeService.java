package com.qa.users.service;

import org.springframework.stereotype.Service;

import com.qa.users.object.Employee;
import com.qa.users.repository.EmployeeRepo;
import com.qa.Constants;

@Service
public class EmployeeService implements EmployeeInterface {

	private EmployeeRepo repo;

	public EmployeeService(EmployeeRepo repo) {
		this.repo = repo;
	}

	public String createEmployee(Employee employee) {
		if (repo.existsByEmail(employee.getEmail())) {
			return Constants.REPEAT_EMPLOYEE;
		}
		this.repo.save(employee);
		return employee.getForename() + " " + employee.getLastname() + Constants.CREATE_EMPLOYEE;
	}

	public Employee readEmployee(String email) {
		if (repo.existsByEmail(email)) {
			return repo.findByEmail(email);
		}
		return null;

	}

	public String updateEmployeePassword(String email, String password) {

		if (repo.existsByEmail(email)) {
			Employee aUser = readEmployee(email);
			aUser.setPassword(password);
			repo.save(aUser);
			return aUser.getForename() + " " + aUser.getLastname() + Constants.UPDATE_PASS;
		}
		return Constants.EMPLOYEE_FAILURE;

	}

	public String deleteEmployee(String email) {
		if (repo.existsByEmail(email)) {
			String name = readEmployee(email).getForename() + " " + readEmployee(email).getLastname();
			repo.deleteById(repo.findByEmail(email).getEmployeeID());
			return name + Constants.DELETE_EMPLOYEE;
		}
		return Constants.EMPLOYEE_FAILURE;

	}

	public String updateEmployeeRole(String email, String role) {

		if (repo.existsByEmail(email)) {
			Employee aUser = readEmployee(email);
			aUser.setRole(role);
			repo.save(aUser);
			return aUser.getForename() + " " + aUser.getLastname() + Constants.UPDATE_ROLE + role + ".";
		}
		return Constants.EMPLOYEE_FAILURE;

	}

}
