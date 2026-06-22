package com.example.OnlineStore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer
{
    @Id
    private String customerId;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNUmber;

    private String email;
    private String password;

}
