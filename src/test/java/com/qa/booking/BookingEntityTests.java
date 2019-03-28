package com.qa.booking;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.bookings.object.Booking;
import com.qa.users.object.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingEntityTests {
	
	Booking testBook = new Booking();

	@Test
	public void StartTime() {
	testBook.setStartTime("a");
		assertEquals("a", testBook.getStartTime());
	}
	
	@Test
	public void EndTimeTest() {
		testBook.setEndTime("a");
		assertEquals("a", testBook.getEndTime());
	}
	
	@Test
	public void PeopleTest() {
		testBook.setNumberOfPeople(1);
		assertEquals(1, testBook.getNumberOfPeople());
	}
	
	@Test
	public void DescriptionTest() {
		testBook.setDescription("a");
		assertEquals("a", testBook.getDescription());
	}
	
	@Test
	public void TitleTest() {
		testBook.setTitle("a");
		assertEquals("a", testBook.getTitle());
	}
	
	

}
