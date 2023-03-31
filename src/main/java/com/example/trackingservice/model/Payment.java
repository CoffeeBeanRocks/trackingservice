package com.example.trackingservice.model;

import jakarta.validation.Valid;

public class Payment {
    private String method;
    private String number;
    @Valid
    private Address billingAddress;

    public Payment(String method, String number, Address billingAddress) {
        this.method = method;
        this.number = number;
        this.billingAddress = billingAddress;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}
