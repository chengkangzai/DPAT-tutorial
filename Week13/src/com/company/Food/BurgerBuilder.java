package com.company.Food;

import com.company.Ingredient.Bread;
import com.company.Ingredient.Cheese;
import com.company.Ingredient.Meat;
import com.company.Interfaces.Ingredient;

import java.util.ArrayList;

public class BurgerBuilder {
    private String name;
    private double price;
    private ArrayList<Ingredient> ingredients;

    public BurgerBuilder() {

    }

    public BurgerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BurgerBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public BurgerBuilder addIngredient(String name) {
        if (ingredients == null) {
            ingredients = new ArrayList<>();
        }
        switch (name) {
            case "Bread":
                ingredients.add(new Bread());
                break;
            case "Meat":
                ingredients.add(new Meat());
                break;
            case "Cheese":
                ingredients.add(new Cheese());
                break;

        }
        return this;
    }

    public Burger build() {
        return new Burger(name, price, ingredients);
    }
}
