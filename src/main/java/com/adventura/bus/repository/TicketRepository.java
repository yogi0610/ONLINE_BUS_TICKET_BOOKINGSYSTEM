package com.adventura.bus.repository;
import com.adventura.bus.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> 
{
}
