package com.example.trackingservice.model;

import java.util.Date;
import java.util.List;

public record InvoiceItem (String status, Date on, Address address, List<Item> items) {

}
