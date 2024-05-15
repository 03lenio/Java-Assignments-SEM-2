package de.nulldrei.may.second;

import java.util.LinkedList;

public class Order {

    LinkedList<Pizza> pizzas = new LinkedList<>();

    public Order() {
    }

    public LinkedList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(LinkedList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public double calculatePrice() {
        double price = 0;
        for(Pizza pizza : pizzas) {
            price+= pizza.calculatePrice();
        }
        return price;
    }
}
