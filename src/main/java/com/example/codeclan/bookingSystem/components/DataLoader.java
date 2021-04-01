package com.example.codeclan.bookingSystem.components;

import com.example.codeclan.bookingSystem.models.Booking;
import com.example.codeclan.bookingSystem.models.Course;
import com.example.codeclan.bookingSystem.models.Customer;
import com.example.codeclan.bookingSystem.repositories.BookingRepository;
import com.example.codeclan.bookingSystem.repositories.CourseRepository;
import com.example.codeclan.bookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Sam Cooke", "Dallas", 91);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Aretha Franklin", "Memphis", 79);
        customerRepository.save(customer2);

        Course course1 = new Course("Jazzical tunes", "Troon", 5);
        courseRepository.save(course1);

        Course course2 = new Course("Python", "Largs", 4);
        courseRepository.save(course2);

        Booking booking1 = new Booking("02-04-2021", customer1, course1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("02-05-2022", customer2, course2);
        bookingRepository.save(booking2);






    }
}
