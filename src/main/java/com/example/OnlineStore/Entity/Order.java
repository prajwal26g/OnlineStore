package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;

    private LocalDateTime datePlaced;

    public Order(){}

    //Constructor
    public Order(LocalDateTime datePlaced)
    {
        this.datePlaced = datePlaced;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;

    @OneToOne(mappedBy = "order")
    private Payment payment;

    @OneToOne(mappedBy = "order")
    private Shipment shipment;

    public long getOrderId()
    {
        return orderId;
    }

    public void setOrderId(long orderId)
    {
        this.orderId = orderId;
    }
}
