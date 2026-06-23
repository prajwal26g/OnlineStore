package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "Order")
    private List<OrderItem> orderItems;

    @OneToOne(mappedBy = "order")
    private Payment payment;

    @OneToOne(mappedBy = "order")
    private Shipment shipment;

    public int getOrderId()
    {
        return orderId;
    }

    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }
}
