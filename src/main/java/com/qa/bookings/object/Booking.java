package com.qa.bookings.object;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.qa.room.Room;
import com.qa.users.object.User;

@Entity
public class Booking {

	@Id
	@GeneratedValue
	private long bookingID;
	
	@ManyToOne
	@JoinColumn(name = "roomID")
	private Room room;
	
	@ManyToOne
	@JoinColumn(name = "userID")
	private User user;

	private String startTime;
	private String endTime;
	//private int numberOfPeople = 1;
	private String title;
	private String description;
	
	public long getBookingID() {
		return bookingID;
	}
	
	public Room getRoom() {
		return room;
	}

	public User getUser() {
		return user;
	}

	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	

	public Booking(Room room, User user, String startTime, String endTime, String title, String description) {
		
		this.room = room;
		this.user = user;
		this.startTime = startTime;
		this.endTime = endTime;
		this.title = title;
		this.description = description;
	}
	
	
	

}
