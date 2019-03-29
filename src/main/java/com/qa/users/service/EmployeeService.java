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

	public Employee readEmployee(long id) {
		if (repo.existsById(id)) {
			return repo.findById(id).get();
		}
		return null;

	}

	public String updateEmployeePassword(long id, String password) {

		if (repo.existsById(id)) {
			Employee aUser = readEmployee(id);
			aUser.setPassword(password);
			repo.save(aUser);
			return aUser.getForename() + " " + aUser.getLastname() + "'s password has beeen changed.";
		}
		return "No such employee.";

	}

	public String deleteEmployee(long id) {
		if (repo.existsById(id)) {
			String name = readEmployee(id).getForename() + " " + readEmployee(id).getLastname();
			this.repo.deleteById(id);
			return name + "'s account has been deleted.";
		}
		return "No such user.";

	}

	public String updateEmployeeRole(long id, String role) {
		
		if (repo.existsById(id)) {
			Employee aUser = readEmployee(id);
			aUser.setRole(role);
			repo.save(aUser);
			return aUser.getForename() + " " + aUser.getLastname() + "'s role has beeen changed to " + role + ".";
		}return "No such user.";
		
	}

}
