package com.qa.gettersapi.room.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.gettersapi.room.object.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long>{
	
}
