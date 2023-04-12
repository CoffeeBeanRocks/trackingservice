package com.example.trackingservice.model;

public record Payment(int id,
                      String method,
                      String number,
                      Address billingAddress) {
}
