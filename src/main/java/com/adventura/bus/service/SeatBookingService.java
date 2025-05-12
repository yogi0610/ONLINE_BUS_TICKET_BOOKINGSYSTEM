package com.adventura.bus.service;
import com.adventura.bus.model.SeatBooking;
import com.adventura.bus.repository.SeatBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class SeatBookingService 
{
    @Autowired
    private SeatBookingRepository seatBookingRepository;
    public SeatBooking saveBooking(SeatBooking booking) 
    {
        return seatBookingRepository.save(booking);
    }
    public List<SeatBooking> getAllBookings() 
    {
        return seatBookingRepository.findAll();
    }
    public void deleteBooking(Long id) 
    {
        seatBookingRepository.deleteById(id);
    }
}
