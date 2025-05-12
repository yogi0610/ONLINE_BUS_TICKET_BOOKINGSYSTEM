package com.adventura.bus.service;
import com.adventura.bus.model.Payment;
import com.adventura.bus.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class PaymentService 
{
    @Autowired
    private PaymentRepository paymentRepository;
    public Payment savePayment(Payment payment) 
    {
        return paymentRepository.save(payment);
    }
    public List<Payment> getAllPayments() 
    {
        return paymentRepository.findAll();
    }
    public Optional<Payment> getPaymentById(Long id) 
    {
        return paymentRepository.findById(id);
    }
    public void deletePayment(Long id) 
    {
        paymentRepository.deleteById(id);
    }
}
