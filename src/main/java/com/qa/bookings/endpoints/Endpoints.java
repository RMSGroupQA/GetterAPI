package com.qa.bookings.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.bookings.object.Booking;
import com.qa.bookings.service.BookingService;

@RestController
public class Endpoints {
	
	private BookingService service;

	public Endpoints(BookingService service) {
		this.service = service;
	}
	
	@Autowired
	RestTemplateBuilder rtb;
	
	@PostMapping("/createBooking")
	public void createBooking(@RequestBody Booking booking) {
		this.service.createBooking(booking);
	}
	
	@PostMapping("/readBooking")
	public void readBooking(@RequestBody Booking booking) {
		this.service.readBooking(booking);
	}
	
	@PostMapping("/updateBooking")
	public void updateBooking(@RequestBody Booking booking) {
		this.service.updateBooking(booking);
	}
	
	@PostMapping("/deleteBooking")
	public void deleteBooking(@RequestBody Booking booking) {
		this.service.deleteBooking(booking);
	}
	
	

}
