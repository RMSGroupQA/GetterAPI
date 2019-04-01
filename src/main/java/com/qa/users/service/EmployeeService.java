package com.qa.users.service;

import org.springframework.stereotype.Service;

import com.qa.users.object.Employee;
import com.qa.users.repository.EmployeeRepo;

@Service
public class EmployeeService implements EmployeeInterface {

	private EmployeeRepo repo;

	public EmployeeService(EmployeeRepo repo) {
		this.repo = repo;
	}

	public String createEmployee(Employee employee) {
		this.repo.save(employee);
		return employee.getForename() + " " + employee.getLastname() + ", you now have an account.";
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
			return aUser.getForename() + " " + aUser.getLastname() + "'s password has beeen changed.";
		}
		return "No such employee.";

	}

	public String deleteEmployee(String email) {
		if (repo.existsByEmail(email)) {
			String name = readEmployee(email).getForename() + " " + readEmployee(email).getLastname();
			repo.deleteById(repo.findByEmail(email).getEmployeeID());
			return name + "'s account has been deleted.";
		}
		return "No such user.";

	}

	public String updateEmployeeRole(String email, String role) {
		
		if (repo.existsByEmail(email)) {
			Employee aUser = readEmployee(email);
			aUser.setRole(role);
			repo.save(aUser);
			return aUser.getForename() + " " + aUser.getLastname() + "'s role has beeen changed to " + role + ".";
		}return "No such user.";
		
	}

}
