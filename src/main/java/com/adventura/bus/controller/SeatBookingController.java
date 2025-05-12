package com.adventura.bus.controller;
import com.adventura.bus.model.SeatBooking;
import com.adventura.bus.service.SeatBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/seats")
@CrossOrigin(origins = "*")
public class SeatBookingController 
{
    @Autowired
    private SeatBookingService bookingService;
    @PostMapping("/book")
    public SeatBooking createBooking(@RequestBody SeatBooking booking) 
    {
        return bookingService.saveBooking(booking);
    }
    @GetMapping
    public List<SeatBooking> getAllBookings() 
    {
        return bookingService.getAllBookings();
    }
    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) 
    {
        bookingService.deleteBooking(id);
    }
}
