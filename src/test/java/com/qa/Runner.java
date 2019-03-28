package com.qa;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.qa.users.UserEntityTest;
import com.qa.users.UserServiceTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   com.qa.booking.BookingEntityTests.class,
   com.qa.room.RoomEntityTest.class,
   com.qa.users.UserEntityTest.class,UserServiceTest.class
   
})

public class Runner {

}
