package com.qa.gettersapi.bookings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.gettersapi.bookings.object.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {

}
