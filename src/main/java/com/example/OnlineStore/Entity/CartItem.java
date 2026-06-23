package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

@Entity
public class CartItem
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cartItemId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


}
