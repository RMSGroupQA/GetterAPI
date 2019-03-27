package com.qa.users.service;

import org.springframework.stereotype.Service;

import com.qa.users.object.User;
import com.qa.users.repository.UserRepo;

@Service
public class UserService implements UserInterface{

	private UserRepo repo;

	public UserService(UserRepo repo) {
		this.repo = repo;
	}

	public User readUser(long id) {
		return repo.findById(id).get();
	}

	@Override
	public String updatePassword(long id,String password) {
		User aUser = readUser(id);
		
		if (aUser != null) {			
			aUser.setPassword(password);
			repo.save(aUser);
		}
		return aUser.getForename() + " " + aUser.getLastname() + "'s password has beeen changed.";

	}

	public String deleteUser(long id) {
		String name = readUser(id).getForename()+" "+ readUser(id).getLastname();
		this.repo.deleteById(id);
		return name +"has been deleted.";

	}

	public String createUser(User user) {
		this.repo.save(user);
		return "Account has been made.";
	}

	public String updateRole(long id, String role) {
		User aUser = readUser(id);
		
		if (aUser != null) {			
			aUser.setRole(role);
			repo.save(aUser);
		}
		return aUser.getForename() + " " + aUser.getLastname() + "'s role has beeen changed to " + role + ".";
	}

}
