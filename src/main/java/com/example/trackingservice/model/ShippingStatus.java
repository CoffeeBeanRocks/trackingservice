package com.example.trackingservice.model;

public class ShippingStatus {
    private int itemId;
    private String status;

    public ShippingStatus(int itemId, String status) {
        this.itemId = itemId;
        this.status = status;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
