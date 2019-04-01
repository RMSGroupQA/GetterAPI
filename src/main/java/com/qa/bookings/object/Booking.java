package com.qa.bookings.object;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import com.qa.room.object.Room;
import com.qa.users.object.Employee;

@Entity
public class Booking {

	@Override
	public String toString() {
		return "Booking [bookingID=" + bookingID + ", room=" + room + ", employee=" + employee + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", numberOfPeople=" + numberOfPeople + ", title=" + title + ", description="
				+ description + "]";
	}

	@Id
	@GeneratedValue(generator="native", strategy=GenerationType.AUTO)
	@GenericGenerator(name="native", strategy="native")
	private long bookingID;

	@ManyToOne
	@JoinColumn(name = "roomID")
	private Room room;

	@ManyToOne
	@JoinColumn(name = "employeeID")
	private Employee employee;

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

	public Employee getEmployee() {
		return employee;
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
	
	public Booking(long bookingID, String title) {
		this.bookingID = bookingID;
		this.title = title;
	}
	
	public Booking() {
		
	}

	
}
