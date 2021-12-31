package com.amar.pos_system.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    private int userId;
    private String email, name, phone;
    private LocalDate dateOfBirth;
    private String userRole;

    public User(int userId, String email, String name, String phone, LocalDate dateOfBirth, String userRole) {
        setUserId(userId);
        setEmail(email);
        setName(name);
        setPhone(phone);
        setDateOfBirth(dateOfBirth);
        setUserRole(userRole);
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

    public void setPhone(String phone) {
        phone = phone.trim();
        // use regex
        if(phone.matches("[0-9]{10}")) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone number should only contain digits 0 - 9 and should contain 10 digits");
        }
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth.isAfter(LocalDate.now())) {
           throw new IllegalArgumentException("Date of birth cannot be in the future");
        }
        else if(Period.between(dateOfBirth, LocalDate.now()).getYears() < 16) {
            throw new IllegalArgumentException("Person should be at least 16 years of age");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public String getUserRole() {
        return userRole;
    }

    public static List<String> getAllRoles() {
        return Arrays.asList("cashier", "admin", "customer");
    }

    public void setUserRole(String userRole) {
        userRole = userRole.trim().toLowerCase();
        if(getAllRoles().contains(userRole)) {
            this.userRole = userRole;
        } else {
            throw new IllegalArgumentException("Role should be selected from the list: " + getAllRoles());
        }
    }
}
