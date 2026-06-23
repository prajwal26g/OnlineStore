package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

@Entity
public class OrderItem
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderItemId;

    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    private OrderItem orderItem;
}
