package com.qa;

public class Constants {
	
	public static final String SEND_EMAIL= "http://localhost:8085/sendCreateEmployee";
	
	public static final String BOOK_FAILURE= "This booking doesn't exist.";
	public static final String CREATE_BOOK= "Booking has been created. Your Booking ID is ";
	public static final String UPDATE_BOOK= "End time has changed.";
	public static final String DELETE_BOOK= "Booking deleted.";
	
	public static final String C_BOOK_PATH= "/createBooking";
	public static final String R_BOOK_PATH= "/readBooking/{id}";
	public static final String U_BOOK_PATH= "/updateBooking/{id}";
	public static final String D_BOOK_PATH= "/deleteBooking/{id}";
	
	public static final String ROOM_FAILURE= "This room doesn't exist.";
	public static final String CREATE_ROOM= "Room has been made.";
	public static final String DELETE_ROOM= " has been deleted.";
	
	public static final String C_ROOM_PATH= "/createRoom";
	public static final String R_ROOM_PATH= "/readRoom/{roomName}";
	public static final String R_ALL_ROOM_PATH= "/getAllRooms";
	public static final String D_ROOM_PATH= "/deleteRoom/{roomName}";
	
	public static final String EMPLOYEE_FAILURE= "No such employee.";
	public static final String CREATE_EMPLOYEE= ", you now have an account.";
	public static final String DELETE_EMPLOYEE= "'s account has been deleted.";
	public static final String UPDATE_PASS= "'s password has beeen changed.";
	public static final String UPDATE_ROLE= "'s role has beeen changed to ";
	public static final String REPEAT_EMPLOYEE= "This account already exists.";
	
	public static final String C_EMPLOYEE_PATH= "/createEmployee";
	public static final String R_EMPLOYEE_PATH= "/readEmployee/{email}";
	public static final String U_EMPLOYEE_PASS_PATH= "/updateEmployeePassword/{email}";
	public static final String U_EMPLOYEE_ROLE_PATH= "/updateEmployeeRole/{email}";
	public static final String D_EMPLOYEE_PATH= "/deleteEmployee/{email}";
	

}
