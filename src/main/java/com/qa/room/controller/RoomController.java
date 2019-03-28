package com.qa.room.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.room.object.Room;
import com.qa.room.service.RoomService;
import com.qa.users.object.User;

@RestController
public class RoomController {
	
	public RoomController(RoomService service) {
		this.service = service;
	}
	
	private RoomService service;
	
	@PostMapping("/createRoom")
	public String createRoom(@RequestBody Room room) {
		return this.service.createRoom(room);
	}
	
	
	@GetMapping("/readRoom/{id}")
	public String getRoom(@PathVariable("id") long id) {
		return this.service.readRoom(id).toString();
	}
	
	@PutMapping("/updateRoom/{id}") 
	public String updateRoom(@PathVariable("id") long id, @RequestBody String role) {
		return this.service.updateRoom(id, role);
	}
	
	@DeleteMapping("/deleteRoom/{id}")
	public String deleteUser(@PathVariable("id") long id) {
		return this.service.deleteRoom(id);
	}

}
