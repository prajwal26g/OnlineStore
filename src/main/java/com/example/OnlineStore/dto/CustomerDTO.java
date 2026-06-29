package com.example.OnlineStore.dto;

import com.example.OnlineStore.Entity.Order;
import com.example.OnlineStore.Entity.Wishlist;
import jakarta.persistence.*;

import java.util.List;

public class CustomerDTO
{
    private long customerId;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    private String email;

    //Constructor
    public CustomerDTO(String firstName, String lastName, String address,
                    String phoneNumber, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Customer can have many orders
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    @OneToOne(mappedBy = "customer")
    private Wishlist wishlist;

    public long getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(long customerId)
    {
        this.customerId = customerId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNUmber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
