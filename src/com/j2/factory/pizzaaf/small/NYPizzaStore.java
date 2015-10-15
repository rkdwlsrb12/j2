package com.j2.factory.pizzaaf.small;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
 
        if (item.equals("potato")) {
  
            pizza = new PotatoPizza(ingredientFactory);
            pizza.setName("New York Style Potato Pizza");
  
        }
        else if (item.equals("cheese")) {
        	  
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
  
        }
        return pizza;
    }
}
