package com.qa.room.service;

import com.qa.room.object.Room;
import com.qa.room.repo.RoomRepo;

public class RoomService implements RoomInterface{
	
	private RoomRepo repo;
	
	public RoomService(RoomRepo repo) {
		this.repo=repo;
	}

	@Override
	public String createRoom(Room room) {
		this.repo.save(room);
		return "Room has been made,";
	}

	@Override
	public Room readRoom(long id) {
		return repo.findById(id).get();
	}

	@Override
	public String updateRoom(long id, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteRoom(long id) {
		String name = readRoom(id).getRoomName();
		this.repo.deleteById(id);
		return name + " has been deleted.";
	}

}
