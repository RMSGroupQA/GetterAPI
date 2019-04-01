package com.qa;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.qa.booking.BookingServiceTests;
import com.qa.users.EmployeeEntityTest;
//import com.qa.users.EmployeeServiceTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   com.qa.booking.BookingEntityTests.class,BookingServiceTests.class,
   com.qa.room.RoomEntityTest.class,
   com.qa.users.EmployeeEntityTest.class,
//   EmployeeServiceTest.class
   
})

public class Runner {

}
