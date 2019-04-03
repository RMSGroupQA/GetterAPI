package com.qa.booking;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.bookings.object.Booking;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingEntityTests {
	
	Booking testBook = new Booking();

	@Test
	public void startTime() {
	testBook.setStartTime("a");
		assertEquals("a", testBook.getStartTime());
	}
	
	@Test
	public void endTimeTest() {
		testBook.setEndTime("a");
		assertEquals("a", testBook.getEndTime());
	}
	
	@Test
	public void peopleTest() {
		testBook.setNumberOfPeople(1);
		assertEquals(1, testBook.getNumberOfPeople());
	}
	
	@Test
	public void descriptionTest() {
		testBook.setDescription("a");
		assertEquals("a", testBook.getDescription());
	}
	
	@Test
	public void titleTest() {
		testBook.setTitle("a");
		assertEquals("a", testBook.getTitle());
	}
	
	@Test
	public void stringTest() {
		testBook.setTitle("a");
		assertEquals("Booking [bookingID=0, room=null, employee=null, startTime=null, endTime=null, numberOfPeople=1, title=a, description=null]", testBook.toString());
	}
	
	

}
