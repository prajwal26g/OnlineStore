package com.example.OnlineStore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

// Contains date of payment, means of payment and the amount paid.
@Entity
public class Payment
{
    @Id
    private String paymentId;
    private Date date;
    private String paymentMethod;
    private double amount;

}
