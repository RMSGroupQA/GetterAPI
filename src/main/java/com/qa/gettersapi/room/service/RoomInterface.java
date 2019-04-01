package com.qa.gettersapi.room.service;

import java.util.List;

import com.qa.gettersapi.room.object.Room;

public interface RoomInterface {
	
	public String createRoom(Room room);
	public Room readRoom(long id);
	public String updateRoom(long id,String role);
	public String deleteRoom(long id);
	public List<Room> readAllRooms();

}
