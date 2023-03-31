package com.example.trackingservice.model;

import jakarta.validation.constraints.NotEmpty;

public class Item {
    @NotEmpty(message = "Item name cannot be empty")
    private String item;
    private int id;
    private double price;

    public Item(String item, double price, int id) {
        this.item = item;
        this.price = price;
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String name) {
        this.item = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
