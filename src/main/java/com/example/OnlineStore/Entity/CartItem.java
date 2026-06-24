package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

@Entity
public class CartItem
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cartItemId;

    private int quantity;

    public CartItem(){}

    //Constructor
    public CartItem(int quantity)
    {
        this.quantity = quantity;
    }

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
}
