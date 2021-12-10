package com.company;

//5.	Create a Product class which has the following members.
//        •	Data members
//        o	productID and productName as string
//        o	productSellingPrice and productCostPrice as real number
//        o	producedBy as Company.
//        •	Member functions
//        o	Constructor
public class Product {
    private String productID;
    private String productName;
    private double productSellingPrice;
    private double productCostPrice;
    private Company producedBy;

    public Product(String productID, String productName, double productSellingPrice, double productCostPrice, Company producedBy) {
        this.productID = productID;
        this.productName = productName;
        this.productSellingPrice = productSellingPrice;
        this.productCostPrice = productCostPrice;
        this.producedBy = producedBy;
    }
}
