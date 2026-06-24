package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Wishlist
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long wishlistId;

    public Wishlist(){}

    @OneToOne
    @JoinColumn(name = "customer_id", unique = true)
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "wishlist_products",
            joinColumns = @JoinColumn(name = "wishlist_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> wishlistProducts;

    public long getWishlistId()
    {
        return wishlistId;
    }

    public void setWishlistId(long wishlistId)
    {
        this.wishlistId = wishlistId;
    }
}
