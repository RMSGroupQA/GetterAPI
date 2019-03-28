package com.qa.room.service;

import com.qa.room.object.Room;

public interface RoomInterface {
	
	public String createRoom(Room room);
	public Room readRoom(long id);
	public String updateRoom(long id,String role);
	public String deleteRoom(long id);

}
