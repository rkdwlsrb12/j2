package com.j2.factory.pizzaaf.small;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new RegularCrustDough();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    
    public Onion createOnion() {
        return new SlicedOnion();
    }
    
    public Potato createPotato() {
        return new MashedPotato();
    }
}