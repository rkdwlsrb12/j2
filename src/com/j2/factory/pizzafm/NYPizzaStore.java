package com.j2.factory.pizzafm;

public class NYPizzaStore extends PizzaStore{
  Pizza createPizza(String type){
    Pizza pizza = null;
    if(type.equals("cheese")){
      pizza = new NYStyleCheesePizza();
    } else if (type.equals("pepperoni")) {
      pizza = new NYStylePepperoniPizza();
    } else if (type.equals("clam")) {
      pizza = new NYStyleClamPizza();
    } else if (type.equals("veggie")) {
      pizza = new NYStyleVeggiePizza();
    } else if (type.equals("potato")) {
      pizza = new NYStylePotatoPizza();
    }
    return pizza;
  }
}