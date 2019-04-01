package com.qa.room.service;

import com.qa.room.object.Room;

public interface RoomInterface {
	
	public String createRoom(Room room);
	public Room readRoom(String roomname);
	public String updateRoom(String roomname,String role);
	public String deleteRoom(String roomname);

}
