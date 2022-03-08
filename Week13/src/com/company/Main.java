package com.company;

import com.company.Food.BurgerBuilder;

public class Main {

    public static void main(String[] args) {
        System.out.println(new BurgerBuilder().setName("Burger").setPrice(10).addIngredient("Meat").addIngredient("Bread").build().toString());

    }
}
