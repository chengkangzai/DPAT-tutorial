package com.company.Food;

import com.company.Interfaces.Ingredient;

import java.util.ArrayList;

public class Burger {
    private String name;
    private double price;
    private ArrayList<Ingredient> ingredients;

    public Burger(String name, double price, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredients=" + ingredients +
                '}';
    }
}
