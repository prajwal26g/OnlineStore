package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;

    private String productName;
    private String description;
    private int stock;
    private double price;

    public Product(){}

    //Constructor
    public Product(String productName, String description, int stock,
                   double price)
    {
        this.productName = productName;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    public long getProductId()
    {
        return productId;
    }

    public void setProductId(long productId)
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
