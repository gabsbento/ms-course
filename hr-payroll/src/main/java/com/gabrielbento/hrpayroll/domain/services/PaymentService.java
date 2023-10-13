package com.gabrielbento.hrpayroll.domain.services;

import com.gabrielbento.hrpayroll.domain.entities.Payment;
import com.gabrielbento.hrpayroll.domain.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {
    @Value("${hr-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public Payment getPayment(Long wokerId, Integer days){
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("workerId", String.valueOf(wokerId));

        Worker worker = restTemplate.getForObject(workerHost + "/workers/{workerId}", Worker.class, uriVariables);
        Payment payment = new Payment(worker.getName(), worker.getDailyIncome(), days);
        return payment;

    }
}
