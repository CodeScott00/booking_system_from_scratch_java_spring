package com.example.codeclan.bookingSystem.controllers;

import com.example.codeclan.bookingSystem.models.Customer;
import com.example.codeclan.bookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(
            @RequestParam(name = "course", required = false) String course
    ){
        if(course != null){
            return new ResponseEntity<List<Customer>>(customerRepository.findCustomerByBookingsCourseNameAllIgnoreCase(course), HttpStatus.I_AM_A_TEAPOT);
        }
        return new ResponseEntity<List<Customer>>(customerRepository.findAll(), HttpStatus.I_AM_A_TEAPOT);
    }
}
