package com.example.trackingservice.controller;

import com.example.trackingservice.model.Invoice;
import com.example.trackingservice.model.ShippingStatus;
import com.example.trackingservice.repository.TrackingRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/trackings")
public class TrackingController {

    private TrackingRepository repository;

    public TrackingController(TrackingRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public int create(@Valid @RequestBody Invoice invoice){
        return repository.create(invoice);
    }

    @GetMapping({"/{id}/{item}"})
    public HashMap<String, String> getInvoiceById(@Valid @PathVariable int id, @Valid @PathVariable int item) {
        Invoice invoice = repository.getInvoiceById(id);
        if(invoice == null)
            throw new IllegalStateException("order with this id does not exist in the system");
        else
        {
            HashMap<String, String> response = new HashMap<>();
            response.put("status", invoice.getInvoiceItem().getStatus());
            response.put("date", invoice.getInvoiceItem().getOn());
            return response;
        }
    }

    @PutMapping({"/{id}"})
    public void updateInvoiceStatus(@Valid @RequestBody ShippingStatus shippingStatus, @Valid @PathVariable int id) {
        repository.update(shippingStatus, id);

    }
}
