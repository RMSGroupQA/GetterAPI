package com.qa.room.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.room.object.Room;
import com.qa.room.repo.RoomRepo;

@Service
public class RoomService implements RoomInterface{
	
	private RoomRepo repo;
	
	public RoomService(RoomRepo repo) {
		this.repo=repo;
	}

	@Override
	public String createRoom(Room room) {
		this.repo.save(room);
		return "Room has been made.";
	}

	@Override
	public Room readRoom(String roomname) {
		if(repo.existsByRoomName(roomname)) {
			return repo.findByRoomName(roomname);
		}return null;
		
	}
	
	public List<Room> getAllRooms(){
		return repo.findAll();
	}

	@Override
	public String deleteRoom(String roomname) {
		if(repo.existsByRoomName(roomname)) {
			String name = readRoom(roomname).getRoomName();
			this.repo.deleteById(repo.findByRoomName(roomname).getRoomID());
			return name + " has been deleted.";
		}return "Room doesn't exist.";
		
	}

}
