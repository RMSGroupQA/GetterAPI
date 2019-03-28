package com.qa.gettersapi.users.service;

import org.springframework.stereotype.Service;

import com.qa.gettersapi.users.object.Employee;
import com.qa.gettersapi.users.repository.EmployeeRepo;

@Service
public class EmployeeService implements EmployeeInterface {

	private EmployeeRepo repo;

	public EmployeeService(EmployeeRepo repo) {
		this.repo = repo;
	}

	public Employee readEmployee(long id) {
		if (repo.existsById(id)) {
			return repo.findById(id).get();
		}
		return null;
	}

	@Override
	public String updatePassword(long id, String password) {

		if (repo.existsById(id)) {
			Employee aEmployee = readEmployee(id);
			aEmployee.setPassword(password);
			repo.save(aEmployee);
			return aEmployee.getForename() + " " + aEmployee.getLastname() + "'s password has beeen changed.";
		}
		return "No such user.";

	}

	public String deleteEmployee(long id) {
		if (repo.existsById(id)) {
			String name = readEmployee(id).getForename() + " " + readEmployee(id).getLastname();
			this.repo.deleteById(id);
			return name + " has been deleted.";
		}
		return "No such user.";

	}

	public String createEmployee(Employee user) {
		this.repo.save(user);
		return "Account has been made.";
	}

	public String updateRole(long id, String role) {
		if (repo.existsById(id)) {
			Employee aEmployee = readEmployee(id);
			aEmployee.setRole(role);
			repo.save(aEmployee);
			return aEmployee.getForename() + " " + aEmployee.getLastname() + "'s role has beeen changed to " + role + ".";
		}
		return "No such employee.";
	}

//	@Override
//	public String createUser(Employee user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Employee readUser(long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String deleteUser(long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
