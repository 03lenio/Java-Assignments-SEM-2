package de.nulldrei.may.second;

import java.util.LinkedList;

public class Pizza {

    private int diameter;

    LinkedList<Ingredient> ingredients = new LinkedList<>();

    public Pizza(int diameter) {
        this.diameter = diameter;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public double calculatePrice() {
        double price = (Math.PI*(Math.pow((diameter/2), 2)))*0.01;
        for(Ingredient ingredient : ingredients) {
            price+=ingredient.getPrice();
        }
        return price;
    }
}
