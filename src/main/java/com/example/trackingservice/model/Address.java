package com.example.trackingservice.model;

import jakarta.validation.constraints.NotEmpty;

public class Address {
    @NotEmpty(message = "State cannot be empty in an address!")
    private String state;
    @NotEmpty(message = "City cannot be empty in an address!")
    private String city;
    private int postalCode;

    public Address(String state, String city, int postalCode)
    {
        this.state = state;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
