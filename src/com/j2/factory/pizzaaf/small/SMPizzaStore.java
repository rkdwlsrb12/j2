package com.j2.factory.pizzaaf.small;

public class SMPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory=new SMPizzaIngredientFactory();
 
        if (item.equals("potato")) {
  
            pizza = new PotatoPizza(ingredientFactory);
            pizza.setName("Sang Myung Style Potato Pizza");
  
        }
        else if (item.equals("cheese")) {
        	  
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Sang Myung Style Cheese Pizza");
  
        }
        return pizza;
    }
}
