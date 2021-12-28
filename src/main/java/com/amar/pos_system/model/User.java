package com.amar.pos_system.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    private int userId;
    private String email, name, phone;
    private LocalDate dateOfBirth;

    public User(int userId, String email, String name, String phone, LocalDate dateOfBirth) {
        setUserId(userId);
        setEmail(email);
        setName(name);
        setPhone(phone);
        setDateOfBirth(dateOfBirth);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        if(userId > 0) {
            this.userId = userId;
        } else {
            throw new IllegalArgumentException("User id cannot be less than 0 or Zero");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email.trim();
        if(email.length() > 1) {
            if(!email.contains("@")) {
                throw new IllegalArgumentException("Email should be in a valid format");
            }
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email should contain at least two characters");
        }
    }

    public String getName() {
        return name;
    }

    public static boolean checkIfHasNumbers(char[] array) {
        boolean valid = false;

        for (char character: array) {
            if(!Character.isDigit(character)) {
                valid = true;
            } else {
                valid = false;
                break; // stops if it finds a digit and return false
            }
        }

        return valid;
    }

    public void setName(String name) {
        name = name.trim();

        if(name.length() > 1) {
            this.name = name;
        } else if(!checkIfHasNumbers(name.toCharArray())) {
            throw new IllegalArgumentException("Name cannot contain numbers");
        } else
        {
            throw new IllegalArgumentException("Name should contain at least two characters");
        }
    }

    public String getPhone() {
        return phone;
    }

    public static String getStringWithOnlyDigits(String word) {

        return
    }

    public void setPhone(String phone) {
        phone = phone.trim();
        // use regex
        if(phone.matches("[0-9]{10}")) {
            System.out.println("Valid phone number");
            this.phone = phone;
        }
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
