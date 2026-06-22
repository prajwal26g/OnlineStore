package com.example.OnlineStore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product
{
    @Id
    private String productId;
    private String description;
    private int stock;
    private double price;
}
