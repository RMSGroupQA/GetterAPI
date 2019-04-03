package com.qa.bookings.service;

import org.springframework.stereotype.Service;

import com.qa.bookings.object.Booking;
import com.qa.bookings.repository.BookingRepo;
import com.qa.Constants;

@Service
public class BookingService implements BookingInterface {

	private BookingRepo bookRepo;

	public BookingService(BookingRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	public String createBooking(Booking booking) {
		this.bookRepo.save(booking);
		return Constants.CREATE_BOOK + booking.getBookingID() + ".";
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
			Booking aBook = bookRepo.findById(id).get();
			aBook.setEndTime(endTime);
			bookRepo.save(aBook);
			return Constants.UPDATE_BOOK;
		}

		return Constants.BOOK_FAILURE;
	}

	@Override
	public String deleteBooking(long id) {
		if (bookRepo.existsById(id)) {
			bookRepo.deleteById(id);
			return Constants.DELETE_BOOK;
		}
		return Constants.BOOK_FAILURE;

	}

}
