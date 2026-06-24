package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Shipment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long shipmentId;//also tracking number

    private LocalDateTime dateBooked;
    private LocalDateTime estimatedDelivery;
    private String shippingPartner;

    public Shipment(){}

    //Constructor
    public Shipment(LocalDateTime dateBooked, LocalDateTime estimatedDelivery,
                    String shippingPartner)
    {
        this.dateBooked = dateBooked;
        this.estimatedDelivery = estimatedDelivery;
        this.shippingPartner = shippingPartner;
    }

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public long getShipmentId()
    {
        return shipmentId;
    }

    public LocalDateTime getDateBooked()
    {
        return dateBooked;
    }

    public void setDateBooked(LocalDateTime dateBooked)
    {
        this.dateBooked = dateBooked;
    }
    public LocalDateTime getEstimatedDelivery()
    {
        return estimatedDelivery;
    }

    public void setEstimatedDelivery(LocalDateTime estimatedDelivery)
    {
        this.estimatedDelivery = estimatedDelivery;
    }

    public String getShippingPartner()
    {
        return shippingPartner;
    }

    public void setShippingPartner(String shippingPartner)
    {
        this.shippingPartner = shippingPartner;
    }
}
