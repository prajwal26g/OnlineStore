package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

import java.util.Date;

// Contains date of payment, means of payment and the amount paid.
@Entity
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String paymentId;

    private Date date;
    private String paymentMethod;
    private double amount;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;



    public String getPaymentId()
    {
        return paymentId;
    }

    public void setPaymentId(String paymentId)
    {
        this.paymentId = paymentId;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getPaymentMethod()
    {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

}
