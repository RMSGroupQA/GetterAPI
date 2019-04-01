package com.qa.gettersapi.room.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.gettersapi.room.object.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long>{
	
	@Query(value = "SELECT * FROM Room", nativeQuery = true)
	public List<Room> listOfRooms();
	
}
