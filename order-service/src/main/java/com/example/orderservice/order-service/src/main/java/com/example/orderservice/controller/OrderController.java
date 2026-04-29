package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @PostMapping
    public String createOrder(@RequestBody String orderDetails) {
        return "Order created successfully. Payment request sent for: " + orderDetails;
    }

    @GetMapping
    public String getOrders() {
        return "List of orders";
    }
}
