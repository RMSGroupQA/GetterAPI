package com.qa.users.service;

import com.qa.users.object.User;

public interface UserInterface {
	
	public String createUser(User user);
	public User readUser(long id);
	public String updateRole(long id,String role);
	public String updatePassword(long id,String password);
	public String deleteUser(long id);

}
