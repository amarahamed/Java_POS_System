package com.amar.pos_system.model;

import com.amar.pos_system.utilities.POS_Encryption;

import java.time.LocalDate;

public class Cashier extends User {
    private int cashierId;
    private String password;

    public Cashier(int userId, String email, String name, String phone, LocalDate dateOfBirth, String userRole, int cashierId, String password) {
        super(userId, email, name, phone, dateOfBirth, userRole);
        setCashierId(cashierId);
        setPassword(password);
    }

    public int getCashierId() {
        return cashierId;
    }

    public void setCashierId(int cashierId) {
        if(cashierId <= 0) {
            throw new IllegalArgumentException("Cashier ID should be greater than 0");
        } else {
            this.cashierId = cashierId;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() < 4) {
            throw new IllegalArgumentException("Password should contain at least 4 characters");
        } else if (password.length() > 8) {
            throw new IllegalArgumentException("Password cannot contain more than 8 characters");
        } else if(password.contains("\"") || password.contains("\\")) {
            throw new IllegalArgumentException("Password cannot contain the special characters - \\, \"");
        } else {
            POS_Encryption encrypt = new POS_Encryption();
            this.password = encrypt.encryptString(password);
        }
    }
}
