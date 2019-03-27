//package com.qa;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.qa.bookings.endpoints.Endpoints;
//import com.qa.bookings.object.Booking;
//import com.qa.bookings.repository.BookingRepo;
//import com.qa.bookings.service.BookingService;
//import com.qa.users.object.User;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes=GettersApplicationTests.class)
//public class GettersApplicationTests {
//	
//	@InjectMocks
//	Endpoints controller;
//	
//	@Autowired
//	private BookingRepo repoMan;
//
//	@Mock
//	BookingService service;
//	
//	User user = new User("Josh","Gomersall","Jeff66","Trainee","josh.gomersall@academytrainee.com");
//	Booking book = new Booking(1L, 1L, 1L, "13:00", "13:15", 5, false, "Scrum Meeting", "Meeting people for a scrum");
//
//	@Test
//	public void emailTest() {
//		user.setEmail("hello.world@academytrainee.com");		
//		assertEquals("hello.world@academytrainee.com", user.getEmail());
//	}
//	
//	@Test
//	public void updateRoleTest() {
//		user.setRole("Homeless Woman");
//		assertEquals("Homeless Woman", user.getRole());
//	}
//	
//	@Test
//	public void changeEndTime() {
//		book.setEndTime("13:30");
//		assertEquals("13:30",book.getEndTime());
//	}
//	
//	@Test
//	public void createBookingTest() {
//
//		Mockito.when(service.createAccount(book)).thenReturn("Success");
//		assertEquals("Success", repoMan.createAccount(ent));
//
//	}
//
//}
