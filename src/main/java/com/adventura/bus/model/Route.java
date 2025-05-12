package com.adventura.bus.model;
import jakarta.persistence.*;
@Entity
@Table(name = "routes")
public class Route 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String source;
    private String destination;
    private String travelTime; 
    private double distance; 
    public Route() 
    {
    }
    public Route(String source, String destination, String travelTime, double distance) 
    {
        this.source = source;
        this.destination = destination;
        this.travelTime = travelTime;
        this.distance = distance;
    }
    public Long getId() 
    {
        return id;
    }
    public void setId(Long id) 
    {
        this.id = id;
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
    public String getTravelTime() 
    {
        return travelTime;
    }
    public void setTravelTime(String travelTime) 
    {
        this.travelTime = travelTime;
    }
    public double getDistance() 
    {
        return distance;
    }
    public void setDistance(double distance) 
    {
        this.distance = distance;
    }
}
