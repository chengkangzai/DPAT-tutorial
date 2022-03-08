package com.company.Ingredient;

import com.company.Interfaces.Ingredient;

public class Bread extends Ingredient {
    private String name;
    private double price;
    private int calories;

    public Bread() {
        this.name = "Bread";
        this.price = 1.00;
        this.calories = 100;
    }

    public Bread(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getCalories() {
        return this.calories;
    }


    @Override
    public String toString() {
        return "Bread{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
