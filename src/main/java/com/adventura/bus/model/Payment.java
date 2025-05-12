package com.adventura.bus.model;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
public class Payment 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String payerName;
    private double amount;
    private String paymentMethod; 
    private LocalDate paymentDate;
    public Payment() 
    {
    }
    public Payment(String payerName, double amount, String paymentMethod, LocalDate paymentDate) 
    {
        this.payerName = payerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }
    public Long getId() 
    { 
        return id; 
    }
    public String getPayerName() 
    { 
        return payerName; 
    }
    public void setPayerName(String payerName) 
    { 
        this.payerName = payerName; 
    }
    public double getAmount() 
    { 
        return amount; 
    }
    public void setAmount(double amount) 
    { 
        this.amount = amount; 
    }
    public String getPaymentMethod() 
    { 
        return paymentMethod; 
    }
    public void setPaymentMethod(String paymentMethod) 
    { 
        this.paymentMethod = paymentMethod; 
    }
    public LocalDate getPaymentDate() 
    { 
        return paymentDate; 
    }
    public void setPaymentDate(LocalDate paymentDate) 
    { 
        this.paymentDate = paymentDate; 
    }
}
