package com.example.trackingservice.model;


public record Address(int id,
                      String state,
                      String city,
                      int postalCode) {
}