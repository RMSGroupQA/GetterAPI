package com.qa.room.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.room.object.Room;
import com.qa.room.service.RoomService;

@RestController
public class RoomController {

	public RoomController(RoomService service) {
		this.service = service;
	}

	private RoomService service;

	@CrossOrigin
	@PostMapping("/createRoom")
	public String createRoom(@RequestBody Room room) {
		return this.service.createRoom(room);
	}

	@CrossOrigin
	@GetMapping("/readRoom/{roomName}")
	public String getRoom(@PathVariable("roomName") String roomName) {
		if (service.readRoom(roomName) != null) {
			return this.service.readRoom(roomName).toString();
		}
		return "Room doesn't exist";
	}
	
	@CrossOrigin
	@GetMapping("/getAllRooms")
	public List<Room> getAllRooms() {
		return service.getAllRooms();
	}

	@CrossOrigin
	@DeleteMapping("/deleteRoom/{roomName}")
	public String deleteUser(@PathVariable("roomName") String roomName) {
		return this.service.deleteRoom(roomName);
	}

}
