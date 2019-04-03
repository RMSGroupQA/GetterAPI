package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.qa.bookings.object.Booking;
import com.qa.users.object.Employee;

@SpringBootApplication
@EnableWebMvc
public class GettersApplication {

	public static void main(String[] args) {
		SpringApplication.run(GettersApplication.class, args);
		Employee book = new Employee();
		System.out.println(book.toString());
	}

}
