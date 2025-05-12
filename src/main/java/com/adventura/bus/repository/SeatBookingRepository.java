package com.adventura.bus.repository;
import com.adventura.bus.model.SeatBooking;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SeatBookingRepository extends JpaRepository<SeatBooking, Long> 
{
}
