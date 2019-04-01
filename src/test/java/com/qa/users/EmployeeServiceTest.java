package com.qa.users;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.users.repository.EmployeeRepo;
import com.qa.users.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {
	
	@InjectMocks
	private EmployeeService service;
	
	@Mock
	private EmployeeRepo employeeRepo;
	
	EmployeeConstants constants = new EmployeeConstants();
	
	
	@Test
	public void createBookingTest() {
		Mockito.when(employeeRepo.save(constants.MOCK_EMPLOYEE)).thenReturn(constants.MOCK_EMPLOYEE);
		assertEquals(constants.CREATE_EMPLOYEE_MESSAGE,service.createEmployee(constants.MOCK_EMPLOYEE));
		Mockito.verify(employeeRepo).save(constants.MOCK_EMPLOYEE);
	}
	
	@Test
	public void readBookingTest() { 
		
		Mockito.when(employeeRepo.findByEmail(constants.ID)).thenReturn(constants.MOCK_LIST);
		Mockito.when(employeeRepo.existsByEmail(constants.ID)).thenReturn(true);
		assertEquals(constants.MOCK_EMPLOYEE,service.readEmployee(constants.ID));
		Mockito.verify(employeeRepo).existsByEmail(constants.ID);
		Mockito.verify(employeeRepo).findByEmail(constants.ID);
	}
	
	@Test
	public void readNonExistingBookingTest() { 
		Mockito.when(employeeRepo.existsByEmail(constants.ID)).thenReturn(false);
		assertEquals(null,service.readEmployee(constants.ID));
		Mockito.verify(employeeRepo).existsByEmail(constants.ID);
	}

	@Test
	public void updateEmployeePasswordTest() {
		Mockito.when(employeeRepo.findByEmail(constants.ID)).thenReturn(constants.MOCK_LIST);
		Mockito.when(employeeRepo.existsByEmail(constants.ID)).thenReturn(true);
		assertEquals(constants.UPDATE_EMPLOYEE_MESSAGE,service.updateEmployeePassword(constants.ID, constants.PASSWORD));
		Mockito.verify(employeeRepo).existsByEmail(constants.ID);
	}
	
	@Test
	public void updateNonExistingEmployeePasswordTest() {
		Mockito.when(employeeRepo.existsByEmail(constants.ID)).thenReturn(false);
		assertEquals(constants.UNSUCCESSFUL_EMPLOYEE_MESSAGE,service.updateEmployeeRole(constants.ID, constants.PASSWORD));
		Mockito.verify(employeeRepo).existsByEmail(constants.ID);
	}
	
	@Test
	public void updateEmployeeRoleTest() {
		Mockito.when(employeeRepo.findByEmail(constants.ID)).thenReturn(constants.MOCK_LIST);
		Mockito.when(employeeRepo.existsByEmail(constants.ID)).thenReturn(true);
		assertEquals(constants.UPDATE_EMPLOYEE_MESSAGE,service.updateEmployeePassword(constants.ID, constants.ROLE));
		Mockito.verify(employeeRepo).existsByEmail(constants.ID);
	}
	
	@Test
	public void updateNonExistingEmployeeRoleTest() {
		Mockito.when(employeeRepo.existsByEmail(constants.ID)).thenReturn(false);
		assertEquals(constants.UNSUCCESSFUL_EMPLOYEE_MESSAGE,service.updateEmployeeRole(constants.ID, constants.ROLE));
		Mockito.verify(employeeRepo).existsByEmail(constants.ID);
	}
	
	@Test
	public void deleteBookingTest() {
		Mockito.when(employeeRepo.existsByEmail(constants.ID)).thenReturn(true);
		assertEquals(constants.DELETE_EMPLOYEE_MESSAGE,service.deleteEmployee(constants.ID));
		Mockito.verify(employeeRepo).existsByEmail(constants.ID);
	}

	@Test
	public void deleteNonExistingBooking() {
		Mockito.when(employeeRepo.existsByEmail(constants.ID)).thenReturn(false);
		assertEquals(constants.UNSUCCESSFUL_EMPLOYEE_MESSAGE,service.deleteEmployee(constants.ID));
		Mockito.verify(employeeRepo).existsByEmail(constants.ID);
	}

}
