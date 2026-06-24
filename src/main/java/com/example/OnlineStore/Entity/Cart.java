package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;

    public Cart(){}

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    //Cart can have many items
    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItems;

}
