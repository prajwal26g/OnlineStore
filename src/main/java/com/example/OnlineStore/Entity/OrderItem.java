package com.example.OnlineStore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrderItem
{
    @Id
    private String orderItemId;
    private int quantity;
    private double price;
}
