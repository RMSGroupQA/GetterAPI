package com.qa.booking;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.bookings.repository.BookingRepo;
import com.qa.bookings.service.BookingService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class BookingServiceTests {

	@InjectMocks
	private BookingService service;
	
	@Mock
	private BookingRepo bookRepo;
	
	BookingConstants constants = new BookingConstants();
	
	
	@Test
	public void createBookingTest() {
		Mockito.when(bookRepo.save(constants.MOCK_BOOKING)).thenReturn(constants.MOCK_BOOKING);
		assertEquals(constants.CREATE_BOOKING_MESSAGE,service.createBooking(constants.MOCK_BOOKING));
		Mockito.verify(bookRepo).save(constants.MOCK_BOOKING);
	}
	
	@Test
	public void readBookingTest() { 
		
		Mockito.when(bookRepo.findById(constants.ID)).thenReturn(constants.MOCK_LIST);
		Mockito.when(bookRepo.existsById(constants.ID)).thenReturn(true);
		assertEquals(constants.MOCK_BOOKING,service.readBooking(constants.ID));
		Mockito.verify(bookRepo).existsById(constants.ID);
		Mockito.verify(bookRepo).findById(constants.ID);
	}
	
	@Test
	public void readNonExistingBookingTest() { 
		Mockito.when(bookRepo.existsById(constants.ID)).thenReturn(false);
		assertEquals(null,service.readBooking(constants.ID));
		Mockito.verify(bookRepo).existsById(constants.ID);
	}

	@Test
	public void updateBooking() {
		Mockito.when(bookRepo.findById(constants.ID)).thenReturn(constants.MOCK_LIST);
		Mockito.when(bookRepo.existsById(constants.ID)).thenReturn(true);
		assertEquals(constants.UPDATE_BOOKING_MESSAGE,service.updateBooking(constants.ID, constants.END_TIME));
		Mockito.verify(bookRepo).existsById(constants.ID);
	}
	
	@Test
	public void updateNonExistingBooking() {
		Mockito.when(bookRepo.existsById(constants.ID)).thenReturn(false);
		assertEquals(constants.UNSUCCESSFUL_BOOKING_MESSAGE,service.updateBooking(constants.ID, constants.END_TIME));
		Mockito.verify(bookRepo).existsById(constants.ID);
	}
	
	@Test
	public void deleteBookingTest() {
		Mockito.when(bookRepo.existsById(constants.ID)).thenReturn(true);
		assertEquals(constants.DELETE_BOOKING_MESSAGE,service.deleteBooking(constants.ID));
		Mockito.verify(bookRepo).existsById(constants.ID);
	}

	@Test
	public void deleteNonExistingBooking() {
		Mockito.when(bookRepo.existsById(constants.ID)).thenReturn(false);
		assertEquals(constants.UNSUCCESSFUL_BOOKING_MESSAGE,service.deleteBooking(constants.ID));
		Mockito.verify(bookRepo).existsById(constants.ID);
	}
}
