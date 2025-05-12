package com.adventura.bus.service;
import com.adventura.bus.model.Booking;
import com.adventura.bus.repository.BookingRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookingService 
{
    @Autowired
    private BookingRepository bookingRepository;
    public Booking saveBooking(Booking booking) 
{
    Booking savedBooking = bookingRepository.save(booking);
    bookingRepository.flush();  
    return savedBooking;
}
    public List<Booking> getAllBookings() 
    {
        return bookingRepository.findAll();
    }
    public Optional<Booking> getBookingById(Long id) 
    {
        return bookingRepository.findById(id);
    }
    public void deleteBooking(Long id) 
    {
        bookingRepository.deleteById(id);
    }
}
