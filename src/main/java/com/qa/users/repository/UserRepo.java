package com.qa.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.users.object.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	
}
