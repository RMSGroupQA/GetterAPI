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
	@GetMapping("/readRoom/{id}")
	public String getRoom(@PathVariable("id") long id) {
		if (service.readRoom(id) != null) {
			return this.service.readRoom(id).toString();
		}
		return "Room doesn't exist";
	}
	
	@CrossOrigin
	@GetMapping("/getAllRooms")
	public List<Room> getAllRooms() {
		return service.getAllRooms();
	}

	@CrossOrigin
	@PutMapping("/updateRoom/{id}")
	public String updateRoom(@PathVariable("id") long id, @RequestBody String role) {
		return this.service.updateRoom(id, role);
	}

	@CrossOrigin
	@DeleteMapping("/deleteRoom/{id}")
	public String deleteUser(@PathVariable("id") long id) {
		return this.service.deleteRoom(id);
	}

}
