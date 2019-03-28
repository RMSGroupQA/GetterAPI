package com.qa.users.endpoints;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.users.object.User;
import com.qa.users.service.UserService;

@RestController
public class UserController {
	
	public UserController(UserService service) {
		this.service = service;
	}

	private UserService service;
	
	@PostMapping("/createUser")
	public String createUser(@RequestBody User user) {
		return this.service.createUser(user);
	}
	
	
	@GetMapping("/readUser/{id}")
	public String readUser(@PathVariable("id") long id) {
		if(this.service.readUser(id)!=null) {
			return this.service.readUser(id).toString();
		}return "No such user.";
		
	}
	
	@PutMapping("/updateUserPassword/{id}")
	public String updatePassword(@PathVariable("id") long id, @RequestBody String password) {
		return this.service.updatePassword(id, password);
	}
	
	@PutMapping("/updateUserRole/{id}") 
	public String updateRole(@PathVariable("id") long id, @RequestBody String role) {
		return this.service.updateRole(id, role);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") long id) {
		return this.service.deleteUser(id);
	}

}
