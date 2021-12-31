package com.amar.pos_system.model;

import com.amar.pos_system.utilities.POS_Encryption;

import java.time.LocalDate;

public class Admin extends User{
    private int adminId;
    private String password;

    public Admin(int userId, String email, String name, String phone, LocalDate dateOfBirth, String userRole, int adminId, String password) {
        super(userId, email, name, phone, dateOfBirth, userRole);
        setAdminId(adminId);
        setPassword(password);
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        if(adminId <= 0) {
            throw new IllegalArgumentException("Admin ID should be greater than 0");
        } else {
            this.adminId = adminId;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() < 8) {
            throw new IllegalArgumentException("Password should contain at least 8 characters");
        } else if (password.length() > 100) {
            throw new IllegalArgumentException("Password cannot contain more than 100 characters");
        } else if(password.contains("\"") || password.contains("\\")) {
            throw new IllegalArgumentException("Password cannot contain the special characters - \\, \"");
        } else {
            POS_Encryption encrypt = new POS_Encryption();
            this.password = encrypt.encryptString(password);
        }
    }
}
