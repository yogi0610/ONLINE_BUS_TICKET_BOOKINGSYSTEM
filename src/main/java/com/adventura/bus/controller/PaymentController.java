package com.adventura.bus.controller;
import com.adventura.bus.model.Payment;
import com.adventura.bus.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*")  
public class PaymentController 
{
    @Autowired
    private PaymentService paymentService;
    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) 
    {
        return paymentService.savePayment(payment);
    }
    @GetMapping
    public List<Payment> getAllPayments() 
    {
        return paymentService.getAllPayments();
    }
    @GetMapping("/{id}")
    public Payment getPayment(@PathVariable Long id) 
    {
        return paymentService.getPaymentById(id).orElse(null);
    }
    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Long id) 
    {
        paymentService.deletePayment(id);
    }
}
