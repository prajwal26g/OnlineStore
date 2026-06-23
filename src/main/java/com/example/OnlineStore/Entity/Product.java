package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String productId;

    private String description;
    private int stock;
    private double price;

    public String getProductId()
    {
        return productId;
    }

    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
