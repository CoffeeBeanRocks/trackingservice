package com.example.trackingservice.repository;


import com.example.trackingservice.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class TrackingRepository {
    List<Invoice> invoices = new ArrayList<>();

    public TrackingRepository() {
        Address iuAddress = new Address("Indiana", "Bloomington", 47408);
        List<Item> myItems = Arrays.asList(new Item("Tea", 24.84, 1), new Item("Turmeric Paste", 22.99, 2));
        InvoiceItem invoiceItem = new InvoiceItem("shipping now", myItems, "3/5/2023", iuAddress);
        Invoice invoice = new Invoice(1, "3/4/2023", 60.26, invoiceItem, new Payment("Discover", "12345678", iuAddress));
        invoices.add(invoice);
    }

    public List<Invoice> findAll() {
        return invoices;
    }

    public int create(Invoice invoice) {
        int id = invoices.size() + 1;
        invoice.setCustomerId(id);
        invoices.add(invoice);
        return id;
    }

    public void update(ShippingStatus status, int id) {
        Invoice x = getInvoiceById(id);
        if(x != null) {
            x.getInvoiceItem().setStatus(status.getStatus());
        }
        else {
            throw new IllegalStateException("invoice id is not valid");
        }
    }

    public Invoice getInvoiceById(int id) {
        return invoices.stream().filter(x -> x.getCustomerId() == id).findAny().orElse(null);
    }
}
