package com.example.trackingservice.controller;


import com.example.trackingservice.model.Invoice;
import com.example.trackingservice.model.Update;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/trackings")
public class TrackingController {

    private final WebClient invoiceService;

    public TrackingController(WebClient.Builder webClientBuilder) {
        invoiceService = webClientBuilder.baseUrl("http://localhost:8082").build();
    }

    @GetMapping("/{orderId}/{itemId}")
    public Map<String, String> findByOrderId(@PathVariable int orderId){
        Map<String, String> response = new HashMap<>();
        Invoice invoice = invoiceService.get().uri("/invoices/{orderId}", orderId).retrieve().bodyToMono(Invoice.class).block();
        if(invoice == null)
            throw new IllegalStateException("Invoice Not Found!");

        response.put("status", invoice.invoiceItems().status());
        response.put("date", invoice.invoiceItems().on().toString());

        return response;
    }

    @PutMapping("/{orderId}")
    public void updateInvoice(@RequestBody Update update, @PathVariable int orderId){
        invoiceService.get().uri("/invoices/{orderId}", update, orderId);
    }
}
