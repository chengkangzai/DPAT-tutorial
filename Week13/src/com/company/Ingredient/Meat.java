package com.company.Ingredient;

import com.company.Interfaces.Ingredient;

public class Meat extends Ingredient {
    private String name;
    private double price;
    private int calories;

    public Meat(){
        this.name = "Meat";
        this.price = 1.99;
        this.calories = 100;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
