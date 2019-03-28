package com.qa.room;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.room.object.Room;
import com.qa.users.object.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoomEntityTest {

	Room testRoom = new Room();

	@Test
	public void buildingTest() {
		testRoom.setBuilding("a");
		assertEquals("a", testRoom.getBuilding());
	}

	@Test
	public void floorTest() {
		testRoom.setFloor("a");
		assertEquals("a", testRoom.getFloor());
	}

	@Test
	public void roomNameTest() {
		testRoom.setRoomName("a");
		assertEquals("a", testRoom.getRoomName());
	}

	@Test
	public void SeatTest() {
		testRoom.setNumOfSeats(1);
		assertEquals(1, testRoom.getNumOfSeats());
	}

	@Test
	public void ComputerTest() {
		testRoom.setNumOfComputers(1);
		assertEquals(1, testRoom.getNumOfComputers());
	}

	@Test
	public void StringTest() {
		assertEquals("Room [roomID=0, bookings=null, building=null, floor=null, roomName=null, numOfSeats=0, numOfComputers=0]", testRoom.toString());
	}

}
