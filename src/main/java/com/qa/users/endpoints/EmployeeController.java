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
	@GetMapping("/readEmployee/{id}")
	public String readEmployee(@PathVariable("id") long id) {
		if (this.service.readEmployee(id) != null) {
			return this.service.readEmployee(id).toString();
		}
		return "No such employee.";

	}

	@CrossOrigin
	@PutMapping("/updateEmployeePassword/{id}")
	public String updatePassword(@PathVariable("id") long id, @RequestBody String password) {
		return this.service.updateEmployeePassword(id, password);
	}

	@CrossOrigin
	@PutMapping("/updateEmployeeRole/{id}")
	public String updateRole(@PathVariable("id") long id, @RequestBody String role) {
		return this.service.updateEmployeeRole(id, role);
	}

	@CrossOrigin
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable("id") long id) {
		return this.service.deleteEmployee(id);
	}

}
