package com.qa.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.users.object.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{
	
	Employee findByEmail(String email);
	boolean existsByEmail(String email);
		
}
