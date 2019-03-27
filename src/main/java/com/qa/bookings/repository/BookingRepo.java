package com.qa.bookings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.bookings.object.Booking;

public interface BookingRepo extends JpaRepository<Booking, Long> {

}
