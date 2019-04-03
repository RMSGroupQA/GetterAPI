package com.qa.bookings.endpoints;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.bookings.object.Booking;
import com.qa.bookings.service.BookingService;
import com.qa.Constants;

@RestController
public class BookingController {
	
	private BookingService service;

	public BookingController(BookingService service) {
		this.service = service;
	}
	@CrossOrigin
	@PostMapping("/createBooking")
	public String createBooking(@RequestBody Booking booking) {
		return this.service.createBooking(booking);
	}
	@CrossOrigin
	@GetMapping("/readBooking/{id}")
	public Booking readBooking(@PathVariable("id") long id) {
		if(service.readBooking(id)!=null) {
			return this.service.readBooking(id);
		}return null;
		
	}
	@CrossOrigin
	@PutMapping("/updateBooking/{id}") 
	public String updateBooking(@PathVariable("id") long id, @RequestBody String role) {
		return this.service.updateBooking(id, role);
	}
	@CrossOrigin
	@DeleteMapping("/deleteBooking/{id}")
	public String deleteBooking(@PathVariable("id") long id) {
		return this.service.deleteBooking(id);
	}
	
	

}
