package com.company.Ingredient;

import com.company.Interfaces.Ingredient;

public class Cheese extends Ingredient {
    private String name;
    private double price;
    private int calories;

    public Cheese(){
        this.name = "Cheese";
        this.price = 1.00;
        this.calories = 100;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
