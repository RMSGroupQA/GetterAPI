package com.qa.users.service;

import org.springframework.stereotype.Service;

import com.qa.users.object.User;
import com.qa.users.repository.UserRepo;

@Service
public class UserService implements UserInterface {

	private UserRepo repo;

	public UserService(UserRepo repo) {
		this.repo = repo;
	}

	public User readUser(long id) {
		if (repo.existsById(id)) {
			return repo.findById(id).get();
		}
		return null;

	}

	@Override
	public String updatePassword(long id, String password) {

		if (repo.existsById(id)) {
			User aUser = readUser(id);
			aUser.setPassword(password);
			repo.save(aUser);
			return aUser.getForename() + " " + aUser.getLastname() + "'s password has beeen changed.";
		}
		return "No such user.";

	}

	public String deleteUser(long id) {
		if (repo.existsById(id)) {
			String name = readUser(id).getForename() + " " + readUser(id).getLastname();
			this.repo.deleteById(id);
			return name + "'s account has been deleted.";
		}
		return "No such user.";

	}

	public String createUser(User user) {
		this.repo.save(user);
		return user.getForename() + " " + user.getLastname() + ", you now have an account.";
	}

	public String updateRole(long id, String role) {
		User aUser = readUser(id);

		if (repo.existsById(id)) {
			aUser.setRole(role);
			repo.save(aUser);
		}
		return aUser.getForename() + " " + aUser.getLastname() + "'s role has beeen changed to " + role + ".";
	}

}
