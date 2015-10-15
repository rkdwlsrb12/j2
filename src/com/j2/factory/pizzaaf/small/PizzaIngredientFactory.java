package com.j2.factory.pizzaaf.small;

public interface PizzaIngredientFactory {
	public Dough createDough();
    public Cheese createCheese();
    public Onion createOnion();
    public Potato createPotato();
}
