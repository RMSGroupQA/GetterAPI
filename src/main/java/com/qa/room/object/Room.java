package com.qa.room.object;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.qa.bookings.object.Booking;

@Entity
public class Room {

	@Id
	@GeneratedValue
	private long roomID;

	@OneToMany(mappedBy = "room")
	private Set<Booking> bookings;

	private String building;
	private String floor;
	private String roomName;
	private int numOfSeats;
	private int numOfComputers;

	public long getRoomID() {
		return roomID;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public int getNumOfComputers() {
		return numOfComputers;
	}

	public void setNumOfComputers(int numOfComputers) {
		this.numOfComputers = numOfComputers;
	}

	public Room() {

	}

	@Override
	public String toString() {
		return "Room [roomID=" + roomID + ", bookings=" + bookings + ", building=" + building + ", floor=" + floor
				+ ", roomName=" + roomName + ", numOfSeats=" + numOfSeats + ", numOfComputers=" + numOfComputers + "]";
	}

}
