package com.adventura.bus.model;
public class Receipt 
{
    private String bookingId;
    private String passengerName;
    private String status;
    private String journeyDate;
    private String bookingDate;
    public Receipt() 
    {
    }
    public Receipt(String bookingId, String passengerName, String status, String journeyDate, String bookingDate) 
    {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.status = status;
        this.journeyDate = journeyDate;
        this.bookingDate = bookingDate;
    }
    public String getBookingId() 
    { 
        return bookingId; 
    }
    public void setBookingId(String bookingId2) 
    { 
        this.bookingId = bookingId2; 
    }
    public String getPassengerName() 
    { 
        return passengerName; 
    }
    public void setPassengerName(String passengerName) 
    { 
        this.passengerName = passengerName; 
    }
    public String getStatus() 
    { 
        return status; 
    }
    public void setStatus(String status) 
    { 
        this.status = status; 
    }
    public String getJourneyDate() 
    { 
        return journeyDate; 
    }
    public void setJourneyDate(String journeyDate) 
    { 
        this.journeyDate = journeyDate; 
    }
    public String getBookingDate() 
    { 
        return bookingDate; 
    }
    public void setBookingDate(String bookingDate) 
    { 
        this.bookingDate = bookingDate; 
    }
    public void setQrCodeData(String qrCode) 
    {
        throw new UnsupportedOperationException("Unimplemented method 'setQrCodeData'");
    }
}
