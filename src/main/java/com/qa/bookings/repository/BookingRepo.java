package com.qa.bookings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.bookings.object.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {

}
