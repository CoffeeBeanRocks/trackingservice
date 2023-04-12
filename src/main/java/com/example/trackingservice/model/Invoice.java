package com.example.trackingservice.model;

import java.util.Date;
import java.util.List;

public record Invoice (Date orderPlaced, float total, InvoiceItem invoiceItems, Payment payment) {

}
