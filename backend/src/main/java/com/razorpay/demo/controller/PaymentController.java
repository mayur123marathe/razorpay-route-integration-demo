package com.razorpay.demo.controller;

import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.demo.dto.OrderRequest;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Value("${razorpay.key.id}")
    private String keyId;

    @Value("${razorpay.key.secret}")
    private String keySecret;

    @PostMapping("/create-order")
    public String createOrder(
            @RequestBody OrderRequest request)
            throws Exception {

        RazorpayClient razorpay =
                new RazorpayClient(keyId, keySecret);

        JSONObject orderRequest =
                new JSONObject();

        orderRequest.put(
                "amount",
                request.getAmount() * 100);

        orderRequest.put(
                "currency",
                "INR");

        Order order =
                razorpay.orders.create(orderRequest);

        return order.toString();
    }
}