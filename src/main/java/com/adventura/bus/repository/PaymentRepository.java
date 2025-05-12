package com.adventura.bus.repository;
import com.adventura.bus.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PaymentRepository extends JpaRepository<Payment, Long> 
{
}
