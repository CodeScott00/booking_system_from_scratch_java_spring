package com.example.codeclan.bookingSystem.repositories;

import com.example.codeclan.bookingSystem.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {


    List<Booking> findBookingsByDate(String date);
}
