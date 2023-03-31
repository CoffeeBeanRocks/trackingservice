package com.example.trackingservice.controller;

import com.example.trackingservice.model.Invoice;
import com.example.trackingservice.model.ShippingStatus;
import com.example.trackingservice.repository.TrackingRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trackings")
public class InvoiceController {

    private TrackingRepository repository;

    public InvoiceController(TrackingRepository repository) {
        this.repository = repository;
    }

    @GetMapping({"/{invoiceId}/{itemId}"})
    public Invoice getInvoiceById(@Valid @PathVariable int invoiceId, @Valid @PathVariable int itemId) {
       return repository.getInvoiceById(invoiceId, itemId);
    }

    @PutMapping({"/{invoiceId}"})
    public void updateInvoiceStatus(@Valid @RequestBody ShippingStatus shippingStatus, @Valid @PathVariable int invoiceId) {
        repository.update(shippingStatus, invoiceId);
    }
}
