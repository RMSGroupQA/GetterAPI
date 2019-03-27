package com.qa.users.endpoints;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.users.object.User;
import com.qa.users.service.UserService;

@RestController
public class UserController {
	
	private UserService service;
	
	@PostMapping("/createUser")
	public void createUser(@RequestBody User user) {
		this.service.createUser(user);
	}
	
	@GetMapping("/readUser")
	public void getUser(@RequestBody User user) {
		this.service.readUser(user);
	}
	
	@PutMapping("/updateUser")
	public void updateUser(@RequestBody User user) {
		
	}
	
	@DeleteMapping("/deleteUser")
	public void deleteUser(@RequestBody User user) {
		
	}

}
