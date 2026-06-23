package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItems;

    private ArrayList<CartItem> items = new ArrayList<>();
}
