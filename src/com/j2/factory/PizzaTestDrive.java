package com.j2.factory;

public class PizzaTestDrive {
 
 public static void main(String[] args) {
  SimplePizzaFactory fac = new SimplePizzaFactory();
  PizzaStore store = new PizzaStore(fac);

  Pizza pizza = store.orderPizza("cheese");
  System.out.println("We ordered a " + pizza.getName() + "\n");
 
  pizza = store.orderPizza("veggie");
  System.out.println("We ordered a " + pizza.getName() + "\n");
  
  pizza = store.orderPizza("potato");
  System.out.println("We ordered a " + pizza.getName() + "\n");
 }
}