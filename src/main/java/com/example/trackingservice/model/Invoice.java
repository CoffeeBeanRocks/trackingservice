package com.example.trackingservice.model;

import jakarta.validation.Valid;

public class Invoice {
    private int customerId;
    private String orderPlaced;
    private double total;
    @Valid
    private InvoiceItem invoiceItem;
    @Valid
    private Payment payment;

    public Invoice(int customerId, String orderPlaced, double total, InvoiceItem invoiceItem, Payment payment) {
        this.customerId = customerId;
        this.orderPlaced = orderPlaced;
        this.total = total;
        this.invoiceItem = invoiceItem;
        this.payment = payment;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getOrderPlaced() {
        return orderPlaced;
    }

    public void setOrderPlaced(String orderPlaced) {
        this.orderPlaced = orderPlaced;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
