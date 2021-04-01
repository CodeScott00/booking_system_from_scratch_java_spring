package com.example.codeclan.bookingSystem.controllers;

import com.example.codeclan.bookingSystem.models.Course;
import com.example.codeclan.bookingSystem.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getCourses(
            @RequestParam(name = "rating", required = false) Integer rating,
            @RequestParam(name = "customer", required = false) String customer


            ){
        //GET course by rating if rating not specified get all courses
        if(rating != null){
            return new ResponseEntity<List<Course>>(courseRepository.findCourseByRating(rating), HttpStatus.I_AM_A_TEAPOT);
        } //GET course by Customer
        if(customer != null){
            return new ResponseEntity<List<Course>>(courseRepository.findCourseByBookingsCustomerNameAllIgnoreCase(customer), HttpStatus.I_AM_A_TEAPOT);
        }
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.I_AM_A_TEAPOT);


    }
}
