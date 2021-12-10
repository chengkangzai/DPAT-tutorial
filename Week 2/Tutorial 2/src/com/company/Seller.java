package com.company;

// creating a Seller class to sell the product.  The Seller class will implement the ProductInterface
public class Seller extends Person implements ProductInterface {
    // creating a method to sell the product
    public void sellProduct() {
        // write your code here
    }

    @Override
    public double calculateSellingPrice() {
        return 0;
    }

    @Override
    public void setProfitMargin(double margin) {

    }
}
