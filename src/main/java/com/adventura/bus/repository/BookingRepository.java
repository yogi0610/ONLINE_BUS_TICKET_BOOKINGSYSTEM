package com.adventura.bus.repository;
import com.adventura.bus.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookingRepository extends JpaRepository<Booking, Long> 
{
}
