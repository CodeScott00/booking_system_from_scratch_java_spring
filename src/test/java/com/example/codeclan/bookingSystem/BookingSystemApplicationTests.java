package com.example.codeclan.bookingSystem;

import com.example.codeclan.bookingSystem.models.Course;
import com.example.codeclan.bookingSystem.repositories.BookingRepository;
import com.example.codeclan.bookingSystem.repositories.CourseRepository;
import com.example.codeclan.bookingSystem.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;


	@Test
	void contextLoads() {
	}


	}




