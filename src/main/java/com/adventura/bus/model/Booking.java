package com.adventura.bus.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Table(name = "book")
public class Booking 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("bookingDateTime")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime bookingDateTime;
    @JsonProperty("journeyDate")
    private LocalDate journeyDate;
    private String status;
    @JsonProperty("bookingDate")
    private LocalDate bookingDate;
    @JsonProperty("passengerName")
    private String passengerName;
    public Booking() 
    {
    }
    public Booking(LocalDateTime bookingDateTime, LocalDate journeyDate, String status,
                   Long busId, Long routeId, Long userId, LocalDate bookingDate,
                   String passengerName, Ticket ticket) 
    {
        this.bookingDateTime = bookingDateTime;
        this.journeyDate = journeyDate;
        this.status = status;
        this.bookingDate = bookingDate;
        this.passengerName = passengerName;
    }
    public Long getId() 
    {
        return id;
    }
    public LocalDateTime getBookingDateTime() 
    {
        return bookingDateTime;
    }
    public void setBookingDateTime(LocalDateTime bookingDateTime) 
    {
        this.bookingDateTime = bookingDateTime;
    }
    public LocalDate getJourneyDate() 
    {
        return journeyDate;
    }
    public void setJourneyDate(LocalDate journeyDate) 
    {
        this.journeyDate = journeyDate;
    }
    public String getStatus() 
    {
        return status;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }
    public LocalDate getBookingDate() 
    {
        return bookingDate;
    }
    public void setBookingDate(LocalDate bookingDate) 
    {
        this.bookingDate = bookingDate;
    }
    public String getPassengerName() 
    {
        return passengerName;
    }
    public void setPassengerName(String passengerName) 
    {
        this.passengerName = passengerName;
    }
}
