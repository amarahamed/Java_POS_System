package com.amar.pos_system.model;

public class Category {
    private int categoryId;
    private String categoryName;

    public Category(int categoryId, String categoryName) {
        setCategoryId(categoryId);
        setCategoryName(categoryName);
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        if(categoryId > 0) {
            this.categoryId = categoryId;
        } else {
            throw new IllegalArgumentException("Category ID should be greater than zero");
        }
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        if(categoryName.length() > 1) {
            this.categoryName = categoryName;
        } else {
            throw new IllegalArgumentException("Category name should contain at least 2 characters");
        }
    }
}
