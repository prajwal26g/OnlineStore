package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

@Entity
public class OrderItem
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderItemId;

    private int quantity;
    private double price;

    public OrderItem(){}

    //Constructor
    public OrderItem(int quantity, double price)
    {
        this.quantity = quantity;
        this.price = price;
    }

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    private OrderItem orderItem;
}
