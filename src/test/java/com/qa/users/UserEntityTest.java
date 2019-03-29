package com.qa.users;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.users.object.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserEntityTest {

	Employee testEmployee = new Employee();	

	@Test
	public void forenameTest() {
		testEmployee.setForename("a");
		assertEquals("a", testEmployee.getForename());
	}

	@Test
	public void surnameTest() {
		testEmployee.setLastname("a");
		assertEquals("a", testEmployee.getLastname());
	}

	@Test
	public void roleTest() {
		testEmployee.setRole("a");
		assertEquals("a", testEmployee.getRole());
	}

	@Test
	public void emailTest() {
		testEmployee.setEmail("a");
		assertEquals("a", testEmployee.getEmail());
	}

	@Test
	public void passwordTest() {
		testEmployee.setPassword("a");
		assertEquals("a", testEmployee.getPassword());
	}
	
	@Test
	public void idTest() {
		assertEquals(0,testEmployee.getEmployeeID());
	}
	
	@Test
	public void StringTest() {
		assertEquals("Employee [employeeID=0, forename=null, lastname=null, role=Trainee, email=null]",testEmployee.toString());
	}

}
