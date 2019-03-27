package com.qa.users.service;

import java.util.Optional;

import com.qa.users.object.User;

public interface UserInterface {
	
	public String createUser(User user);
	public Optional<User> readUser(User user);
	public String updateRole(User user,String role);
	public String updatePassword(User user,String password);
	public String deleteUser(User user);

}
