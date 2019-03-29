package com.qa.users;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.users.object.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	Employee testUser = new Employee();
	
	@Test
	public void readTest() {
			
	}

}
