package com.gabrielbento.hrpayroll.domain.services;

import com.gabrielbento.hrpayroll.domain.entities.Payment;
import com.gabrielbento.hrpayroll.domain.entities.Worker;
import com.gabrielbento.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long wokerId, Integer days){
        Worker worker = workerFeignClient.findById(wokerId).getBody();
        Payment payment = new Payment(worker.getName(), worker.getDailyIncome(), days);
        return payment;

    }
}
