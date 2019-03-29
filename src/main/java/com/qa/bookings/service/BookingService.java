package com.qa.bookings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.qa.bookings.object.Booking;
import com.qa.bookings.repository.BookingRepo;

@Service
public class BookingService implements BookingInterface {

	private BookingRepo bookRepo;

	public BookingService(BookingRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Autowired
	public JmsTemplate jmsTemplate;

	public String createBooking(Booking booking) {
		this.bookRepo.save(booking);
		return "Booking has been successfully created.";
	}

	@Override
	public Booking readBooking(long id) {
		if (bookRepo.existsById(id)) {
			return bookRepo.findById(id).get();
		}
		return null;

	}

	@Override
	public String updateBooking(long id, String endTime) {

		if (bookRepo.existsById(id)) {
			Booking aBook = readBooking(id);
			aBook.setEndTime(endTime);
			bookRepo.save(aBook);
			return "End time has been changed.";
		}

		return "Booking doesn't exist.";
	}

	@Override
	public String deleteBooking(long id) {
		if (bookRepo.existsById(id)) {
			bookRepo.deleteById(id);
			return "Booking deleted.";
		}
		return "Booking doesn't exist.";

	}

}
