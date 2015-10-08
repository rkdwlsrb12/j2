package com.j2.decorator;
public class CaramelMacchiato extends Beverage {
	public CaramelMacchiato() {
		description = "Caramel Macchiato";
	}
  
	public double cost() {
		return 1.99+0.50+0.80;
	}

}
