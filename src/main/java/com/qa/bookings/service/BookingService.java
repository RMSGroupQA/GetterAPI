package com.qa.bookings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.qa.bookings.object.Booking;
import com.qa.bookings.repository.BookingRepo;

@Service
public class BookingService implements BookingInterface{
	
	private BookingRepo bookRepo;
	
	public BookingService(BookingRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Autowired
	public JmsTemplate jmsTemplate;
	
	public String createBooking(Booking booking) {
		this.bookRepo.save(booking);
//		jmsTemplate.convertAndSend("Booking List", booking);	
		return "Booking has been successfully created";
	}
	
	@Override
	public Booking readBooking(long id) {
		return bookRepo.findById(id).get();
	}

	@Override
	public String updateBooking(long id, String endTime) {
		Booking aBook = readBooking(id);
		
		if (aBook != null) {
			aBook.setEndTime(endTime);
			bookRepo.save(aBook);
			return "End time has been changed.";
		}
		
		return "Booking doesn't exist.";
	}

	@Override
	public String deleteBooking(long id) {
		bookRepo.deleteById(id);
		return "Booking deleted.";
	}

}
