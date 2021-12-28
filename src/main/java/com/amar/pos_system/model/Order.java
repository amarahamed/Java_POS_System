package com.amar.pos_system.model;

import java.time.LocalDate;
import java.time.Period;

public class Order {
    private int orderId, userId;
    private LocalDate orderDate;
    private float totalAmount;

    public Order(int orderId, int userId, float totalAmount) {
        setOrderId(orderId);
        setUserId(userId);
        // current date will be stored at the order date
        setOrderDate(LocalDate.now());
        setTotalAmount(totalAmount);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        if(orderId <= 0) {
            throw new IllegalArgumentException("Order ID should be more than 0");
        } else {
            this.orderId = orderId;
        }
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        // validate by calling the sql method to check if the user id is present in the db
        if(userId <= 0) {
            throw new IllegalArgumentException("Opps! user id is not valid");
        } else {
            this.userId = userId;
        }
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        if(Period.between(orderDate, LocalDate.now()).getDays() <= 1) {
            this.orderDate = orderDate;
        } else {
            throw new IllegalArgumentException("Order date cannot be yesterday or before");
        }
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        if(totalAmount <= 0) {
            throw new IllegalArgumentException("Order total cannot be less than or 0");
        } else {
            this.totalAmount = totalAmount;
        }
    }
}
