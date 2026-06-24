package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    private String email;
    private String password;

    public Customer(){}

    //Constructor
    public Customer(String firstName, String lastName, String address,
                    String phoneNumber, String email, String password)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
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

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
