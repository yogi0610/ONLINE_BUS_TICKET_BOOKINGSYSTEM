package com.adventura.bus.controller;
import com.adventura.bus.model.Booking;
import com.adventura.bus.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "*")  
public class BookingController 
{
    @Autowired
    private BookingService bookingService;
    @PostMapping("/create")
    public Booking createBooking(@RequestBody Booking booking) 
    {
        System.out.println("Booking received: " + booking);
        return bookingService.saveBooking(booking);
    }
    @GetMapping
    public List<Booking> getAllBookings() 
    {
        return bookingService.getAllBookings();
    }
    @GetMapping("/{id}")
    public Booking getBooking(@PathVariable Long id) 
    {
        return bookingService.getBookingById(id).orElse(null);
    }
    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) 
    {
        bookingService.deleteBooking(id);
    }
}
