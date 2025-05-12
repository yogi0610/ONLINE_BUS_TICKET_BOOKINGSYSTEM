package com.adventura.bus.model;
import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "seat_booking")
public class SeatBooking 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @Column(name = "seat_numbers")
    private String seatNumbers;
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookingDate = new Date();
    public Long getId() 
    { 
        return id; 
    }
    public String getUsername() 
    { 
        return username; 
    }
    public void setUsername(String username) 
    { 
        this.username = username; 
    }
    public String getSeatNumbers() 
    { 
        return seatNumbers; 
    }
    public void setSeatNumbers(String seatNumbers) 
    { 
        this.seatNumbers = seatNumbers; 
    }
    public Date getBookingDate() 
    { 
        return bookingDate; 
    }
    public void setBookingDate(Date bookingDate) 
    { 
        this.bookingDate = bookingDate; 
    }
}
