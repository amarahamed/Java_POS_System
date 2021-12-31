package com.amar.pos_system.model;

import java.time.LocalDate;

public class Customer extends User{
    private String address,
            postalCode; // L2G F8D  - 6 chars with one space between - total 7 chars
    private int loyaltyCardNumber; // 9 digits

    public Customer(int userId, String email, String name, String phone, LocalDate dateOfBirth, String userRole, String address, String postalCode, int loyaltyCardNumber) {
        super(userId, email, name, phone, dateOfBirth, userRole);
        setAddress(address);
        setLoyaltyCardNumber(loyaltyCardNumber);
        setPostalCode(postalCode);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLoyaltyCardNumber() {
        return loyaltyCardNumber;
    }

    /**
     * loyalty card number should contain 9 digits (only digits)
     * @param loyaltyCardNumber -
     */
    public void setLoyaltyCardNumber(int loyaltyCardNumber) {
        if(loyaltyCardNumber >= 100000000 && loyaltyCardNumber <= 999999999) {
            this.loyaltyCardNumber = loyaltyCardNumber;
        } else {
            throw new IllegalArgumentException("Loyalty card number should contain 9 digits ranging from 100000000 to 999999999");
        }
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        postalCode = postalCode.trim().toUpperCase();
        if(postalCode.length() == 7) {
            throw new IllegalArgumentException("Postal code should contain 6 characters and a space example: L2C 8V9");
        }
        else if(postalCode.matches("[A-Z]\\d[A-Z]\\s\\d[A-Z]\\d")) {
            this.postalCode = postalCode;
        } else {
            throw new IllegalArgumentException("Postal code should match the format example: L1C 2V5");
        }
    }
}
