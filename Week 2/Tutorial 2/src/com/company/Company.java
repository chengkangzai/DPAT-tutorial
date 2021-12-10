package com.company;

//3.	Create a Company class with the following members
//•	Data members
//        o	companyName as String
//        o	companyAddress as Address
//        •	Member functions
//        o	Constructor to set the default value
//        o	UpdateAddress which will receive an Address object argument to update the company address
public class Company {
    String companyName;
    Address companyAddress;

    public Company(String companyName, Address companyAddress) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public void updateAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }
}
