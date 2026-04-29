package com.example.paymentservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @PostMapping
    public String processPayment(@RequestBody String paymentDetails) {
        return "Payment processed successfully for: " + paymentDetails;
    }

    @GetMapping
    public String getPayments() {
        return "List of payments";
    }
}
