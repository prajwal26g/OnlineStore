package com.example.OnlineStore.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

// Contains date of payment, means of payment and the amount paid.
@Entity
public class Payment
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentId;

    private LocalDateTime date;
    private String paymentMethod;
    private double amount;

    private enum PaymentStatus
    {
        PENDING,
        COMPLETE,
        REFUNDED,
        FAILED,
        REVOKED
    }

    private PaymentStatus status;

    public Payment(){}

    //Constructor
    public Payment(LocalDateTime date, String paymentMethod, double amount,
                   PaymentStatus status)
    {
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.status = status;
    }

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public long getPaymentId()
    {
        return paymentId;
    }

    public void setPaymentId(long paymentId)
    {
        this.paymentId = paymentId;
    }

    public LocalDateTime getDate()
    {
        return date;
    }

    public void setDate(LocalDateTime date)
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
