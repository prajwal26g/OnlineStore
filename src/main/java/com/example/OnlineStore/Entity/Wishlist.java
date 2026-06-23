package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Wishlist
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String wishlistId;

    @OneToOne
    @JoinColumn(name = "customer_id", unique = true)
    private Customer customer;

    @OneToMany(mappedBy = "wishlist")
    private List<Product> products;



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "wishlist_products",
            joinColumns = @JoinColumn(name = "wishlist_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> wishlistProducts;

    public String getWishlistId()
    {
        return wishlistId;
    }

    public void setWishlistId(String wishlistId)
    {
        this.wishlistId = wishlistId;
    }
}
