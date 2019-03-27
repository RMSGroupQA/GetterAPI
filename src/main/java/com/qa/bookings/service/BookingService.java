package com.qa.bookings.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.qa.bookings.object.Booking;
import com.qa.bookings.repository.BookingRepo;

@Service
public class BookingService {
	
	private BookingRepo bookRepo;
	
	public BookingService(BookingRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Autowired
	public JmsTemplate jmsTemplate;
	
	public String createBooking(Booking booking) {
		this.bookRepo.save(booking);
		jmsTemplate.convertAndSend("Booking List", booking);
		return "Booking has been successfully created";
	}
	
	public Optional<Booking> readBooking(Booking booking) {
		return bookRepo.findById(booking.getBookingID());
	}
	
	public String updateBooking(Booking booking) {
		this.bookRepo.deleteById(booking.getBookingID());
		this.bookRepo.save(booking);
		jmsTemplate.convertAndSend("Booking List", booking);
		return "Booking has been successfully updated";
	}
	
	public String deleteBooking(Booking booking) {
		this.bookRepo.delete(booking);
		return "Booking has been successfully deleted";
	}

}
