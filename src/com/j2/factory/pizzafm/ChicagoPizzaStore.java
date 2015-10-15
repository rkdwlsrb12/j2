package com.j2.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore{
	  Pizza createPizza(String type){
		    Pizza pizza = null;
		    if(type.equals("cheese")){
		      pizza = new ChicagoStyleCheesePizza();
		    } else if (type.equals("pepperoni")) {
		      pizza = new ChicagoStylePepperoniPizza();
		    } else if (type.equals("clam")) {
		      pizza = new ChicagoStyleClamPizza();
		    } else if (type.equals("veggie")) {
		      pizza = new ChicagoStyleVeggiePizza();
		    } else if (type.equals("potato")) {
		      pizza = new ChicagoStylePotatoPizza();
		    }
		    return pizza;
		  }
		}
