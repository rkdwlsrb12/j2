package com.j2.factory.pizzaaf.small;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
    
    public Onion createOnion() {
        return new ChoppedOnion();
    }
    
    public Potato createPotato() {
        return new SlicedPotato();
    }
}
