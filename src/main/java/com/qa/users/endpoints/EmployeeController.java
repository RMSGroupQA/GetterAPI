package com.qa.users.endpoints;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.users.object.Employee;
import com.qa.users.service.EmployeeService;


@RestController
public class EmployeeController {

	public EmployeeController(EmployeeService service) {
		this.service = service;
	}

	private EmployeeService service;

	@CrossOrigin
	@PostMapping("/createEmployee")
	public String createEmployee(@RequestBody Employee employee) {
		return this.service.createEmployee(employee);
	}

	@CrossOrigin
	@GetMapping("/readEmployee/{email}")
	public String readEmployee(@PathVariable("email") String email) {
		if (this.service.readEmployee(email) != null) {
			return this.service.readEmployee(email).toString();
		}
		return "No such employee.";

	}
	
	@CrossOrigin
	@PutMapping("/updateEmployeePassword/{email}")
	public String updatePassword(@PathVariable("email") String email, @RequestBody String password) {
		return this.service.updateEmployeePassword(email, password);
	}

	@CrossOrigin
	@PutMapping("/updateEmployeeRole/{email}")
	public String updateRole(@PathVariable("email") String email, @RequestBody String role) {
		return this.service.updateEmployeeRole(email, role);
	}

	@CrossOrigin
	@DeleteMapping("/deleteEmployee/{email}")
	public String deleteEmployee(@PathVariable("email") String email) {
		return this.service.deleteEmployee(email);
	}

}
