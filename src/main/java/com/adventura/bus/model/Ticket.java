package com.adventura.bus.model;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "tickets")
public class Ticket 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String passengerName;
    private String source;
    private String destination;
    private LocalDate departureDate;
    private String busNumber;
    private String seatNumber;
    private double price;
    public Ticket() 
    {
    }
    public Ticket(String passengerName, String source, String destination, LocalDate departureDate,
                  String busNumber, String seatNumber, double price) 
    {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.departureDate = departureDate;
        this.busNumber = busNumber;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    public Long getId() 
    { 
        return id; 
    }
    public void setId(Long id) 
    { 
        this.id = id; 
    }
    public String getPassengerName() 
    { 
        return passengerName; 
    }
    public void setPassengerName(String passengerName) 
    { 
        this.passengerName = passengerName; 
    }
    public String getSource() 
    { 
        return source; 
    }
    public void setSource(String source) 
    { 
        this.source = source; 
    }
    public String getDestination() 
    { 
        return destination; 
    }
    public void setDestination(String destination) 
    { 
        this.destination = destination; 
    }
    public LocalDate getDepartureDate() 
    { 
        return departureDate; 
    }
    public void setDepartureDate(LocalDate departureDate) 
    { 
        this.departureDate = departureDate; 
    }
    public String getBusNumber() 
    { 
        return busNumber; 
    }
    public void setBusNumber(String busNumber) 
    { 
        this.busNumber = busNumber; 
    }
    public String getSeatNumber() 
    { 
        return seatNumber; 
    }
    public void setSeatNumber(String seatNumber) 
    { 
        this.seatNumber = seatNumber; 
    }
    public double getPrice() 
    { 
        return price; 
    }
    public void setPrice(double price) 
    { 
        this.price = price; 
    }
}
