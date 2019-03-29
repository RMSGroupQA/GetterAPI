package com.qa.gettersapi.bookings.service;

import com.qa.gettersapi.bookings.object.Booking;

public interface BookingInterface {
	
	public String createBooking(Booking booking);
	public Booking readBooking(long id);
	public String updateBooking(long id,String role);
	public String deleteBooking(long id);

}
