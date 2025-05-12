package com.adventura.bus.controller;
import com.adventura.bus.model.Ticket;
import com.adventura.bus.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/tickets")
public class TicketController 
{
    @Autowired
    private TicketRepository ticketRepository;
    @PostMapping("/add")
    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) 
    {
        Ticket createdTicket = ticketRepository.save(ticket); 
        return ResponseEntity.ok(createdTicket); 
    }
    @GetMapping("/")
    public List<Ticket> getAllTickets() 
    {
        return ticketRepository.findAll(); 
    }
    @GetMapping("/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable Long id) 
    {
        Ticket ticket = ticketRepository.findById(id).orElse(null);
        if (ticket != null) 
        {
            return ResponseEntity.ok(ticket);
        } 
        else 
        {
            return ResponseEntity.notFound().build();
        }
    }
}
