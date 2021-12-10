package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Student{
    private String name;
    private String address;
    private String contact;

    public Student(String name, String address, String contact){
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contact);
    }
}