package com.qa.users.object;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.qa.bookings.object.Booking;

@Entity
public class User {

	@Id
	@GeneratedValue
	private long userID;
	
	@OneToMany(mappedBy = "user")
	private Set<Booking> bookings;
	
	private String forename;
	private String lastname;
	private String password;
	private String role;
	private String email;
	
	
	public long getUserID() {
		return userID;
	}
	
	public void setUserID(long userID) {
		this.userID = userID;
	}
	
	public String getForename() {
		return forename;
	}
	
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [userID=" + userID + ", forename=" + forename + ", lastname=" + lastname +
				", role=" + role + ", email=" + email +"]";
	}
	
	public User() {
		
	}

//	public User(String forename, String lastname, String password, String role, String email) {
//		super();
//		this.forename = forename;
//		this.lastname = lastname;
//		this.password = password;
//		this.role = role;
//		this.email = email;
//	}

}
