package com.example.trackingservice.model;

import jakarta.validation.Valid;

import java.util.List;

public class InvoiceItem {
    private String status;
    @Valid
    private List<Item> items;
    private String on;
    @Valid
    private Address address;

    public InvoiceItem(String status, List<Item> items, String on, Address address) {
        this.status = status;
        this.items = items;
        this.on = on;
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getOn() {
        return on;
    }

    public void setOn(String on) {
        this.on = on;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
