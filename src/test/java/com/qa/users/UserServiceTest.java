package com.qa.users;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.users.object.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	User testUser = new User();
	
	@Test
	public void readTest() {
			
	}

}
