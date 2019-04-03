package com.qa.users.endpoints;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.users.object.Employee;
import com.qa.users.service.EmployeeService;
import com.qa.Constants;

@RestController
public class EmployeeController {

	public EmployeeController(EmployeeService service, RestTemplateBuilder restBuilder) {
		this.service = service;
		this.restTemplate = restBuilder.build();
	}

	private EmployeeService service;
	private RestTemplate restTemplate;

	@CrossOrigin
	@PostMapping("/emailVerify/getters/createEmployee")
	public String createEmployee(@RequestBody Employee employee) {
		String status = this.service.createEmployee(employee);
		if (status.equals("This account already exists.")) {
			return status;
		} else {
			restTemplate.postForEntity(Constants.SENDEMAIL, employee, String.class).getBody();
			return status;
		}

	}

	@CrossOrigin
	@GetMapping("/getters/readEmployee/{email}")
	public String readEmployee(@PathVariable("email") String email) {
		if (this.service.readEmployee(email) != null) {
			return this.service.readEmployee(email).toString();
		}
		return Constants.EMPLOYEE_FAILURE;

	}

	@CrossOrigin
	@PutMapping("/getters/updateEmployeePassword/{email}")
	public String updatePassword(@PathVariable("email") String email, @RequestBody String password) {
		return this.service.updateEmployeePassword(email, password);
	}

	@CrossOrigin
	@PutMapping("/getters/updateEmployeeRole/{email}")
	public String updateRole(@PathVariable("email") String email, @RequestBody String role) {
		return this.service.updateEmployeeRole(email, role);
	}

	@CrossOrigin
	@DeleteMapping("/getters/deleteEmployee/{email}")
	public String deleteEmployee(@PathVariable("email") String email) {
		return this.service.deleteEmployee(email);
	}

}
