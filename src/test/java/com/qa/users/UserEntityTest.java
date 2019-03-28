package com.qa.users;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.users.object.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserEntityTest {

	User testUser = new User();	

	@Test
	public void forenameTest() {
		testUser.setForename("a");
		assertEquals("a", testUser.getForename());
	}

	@Test
	public void surnameTest() {
		testUser.setLastname("a");
		assertEquals("a", testUser.getLastname());
	}

	@Test
	public void roleTest() {
		testUser.setRole("a");
		assertEquals("a", testUser.getRole());
	}

	@Test
	public void emailTest() {
		testUser.setEmail("a");
		assertEquals("a", testUser.getEmail());
	}

	@Test
	public void passwordTest() {
		testUser.setPassword("a");
		assertEquals("a", testUser.getPassword());
	}
	
	@Test
	public void idTest() {
		assertEquals(0,testUser.getUserID());
	}
	
	@Test
	public void StringTest() {
		assertEquals("User [userID=0, forename=null, lastname=null, role=null, email=null]",testUser.toString());
	}

}
