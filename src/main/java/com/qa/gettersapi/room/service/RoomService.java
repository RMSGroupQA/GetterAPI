package com.qa.gettersapi.room.service;

import org.springframework.stereotype.Service;

import com.qa.gettersapi.room.object.Room;
import com.qa.gettersapi.room.repo.RoomRepo;

@Service
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
		if (repo.existsById(id)) {
			return repo.findById(id).get();
		} return null;
	}

	@Override
	public String updateRoom(long id, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteRoom(long id) {
		if (repo.existsById(id)) {
			String name = readRoom(id).getRoomName();
			this.repo.deleteById(id);
			return name + " has been deleted.";
		} return "Room doesn't exist.";
	}

}
