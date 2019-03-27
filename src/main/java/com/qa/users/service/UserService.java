package com.qa.users.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.users.object.User;
import com.qa.users.repository.UserRepo;

@Service
public class UserService implements UserInterface{

	private UserRepo repo;

	public UserService(UserRepo repo) {
		this.repo = repo;
	}

	public Optional<User> readUser(User user) {
		return repo.findById(user.getUserID());
	}

	public String updatePassword(User user,String password) {
		user.setRole(password);
		return user.getForename() +" " +user.getLastname()+"'s role has beeen changed.";

	}

	public String deleteUser(User user) {
		String name = user.getForename()+" "+user.getLastname();
		repo.delete(user);
		return name +"has been deleted.";

	}

	public String createUser(User user) {
		repo.save(user);
		return "Account has been made.";
	}

	public String updateRole(User user, String role) {
		user.setRole(role);
		return user.getForename() + " " + user.getLastname() + "'s role has beeen changed to " + role + ".";
	}

}
