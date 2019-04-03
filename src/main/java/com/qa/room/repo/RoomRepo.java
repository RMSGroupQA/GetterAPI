package com.qa.room.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.room.object.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long>{

	boolean existsByRoomName(String roomname);

	Room findByRoomName(String roomname);
	
}
