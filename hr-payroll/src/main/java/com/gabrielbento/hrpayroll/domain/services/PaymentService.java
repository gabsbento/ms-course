package com.gabrielbento.hrpayroll.domain.services;

import com.gabrielbento.hrpayroll.domain.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long wokerId, Integer days){
        Payment payment = new Payment("John Doe", 100.00, days);
        return payment;

    }
}
