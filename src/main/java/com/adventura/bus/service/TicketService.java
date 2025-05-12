package com.adventura.bus.service;
import com.adventura.bus.model.Ticket;
import com.adventura.bus.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TicketService 
{
    @Autowired
    private TicketRepository ticketRepository;
    public List<Ticket> getAllTickets() 
    {
        return ticketRepository.findAll();
    }
    public Ticket saveTicket(Ticket ticket) 
    {
        return ticketRepository.save(ticket);
    }
}
