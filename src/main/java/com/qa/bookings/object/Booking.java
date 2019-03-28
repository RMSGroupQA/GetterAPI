package com.qa.bookings.object;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.qa.room.object.Room;
import com.qa.users.object.User;

@Entity
public class Booking {

	@Override
	public String toString() {
		return "Booking [bookingID=" + bookingID + ", room=" + room + ", user=" + user + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", numberOfPeople=" + numberOfPeople + ", title=" + title + ", description="
				+ description + "]";
	}

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
	private int numberOfPeople = 1;
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

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
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

	
}
