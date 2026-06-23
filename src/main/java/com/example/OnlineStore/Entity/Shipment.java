package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Shipment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String shipmentId;

    private Date date;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;


}
