package com.amar.pos_system.model;

import javafx.scene.image.Image;

public class Product {
    private int productId;
    private int categoryId;
    private String productName;
    private float productPrice;
    private Image productImage;

    public Product(int productId, int categoryId, String productName, float productPrice, Image productImage) {
        setProductId(productId);
        setCategoryId(categoryId);
        setProductName(productName);
        setProductPrice(productPrice);
        setProductImage();
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        if(productId > 0) {
            this.productId = productId;
        } else {
            throw new IllegalArgumentException("Product id should be greater than 0");
        }
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        if(categoryId > 0) {
            this.categoryId = categoryId;
        } else {
            throw new IllegalArgumentException("Category id should be greater than 0");
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        productName = productName.trim(); // removes all empty spaces
        if(productName.length() > 1) {
            this.productName = productName;
        } else {
            throw new IllegalArgumentException("Product name should contain at least two characters");
        }
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        if(productPrice <= 0) {
            throw new IllegalArgumentException("Product price cannot be less than 0 or zero");
        } else {
            this.productPrice = productPrice;
        }
    }

    public Image getProductImage() {
        return productImage;
    }

    public void setProductImage() {
        // product id
        String imgPath = String.format("../images/item%d.png", productId);
        if(imgPath.contains(String.format("../images/item%d.png", productId))) {
            productImage = new Image(imgPath);
        } else {
            throw new IllegalArgumentException("Image should be in png format");
        }
    }
}
