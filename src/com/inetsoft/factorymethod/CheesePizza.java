package com.inetsoft.factorymethod;

public class CheesePizza extends Pizza {

	public CheesePizza() {
		this.name = "Cheese Pizza";
		this.dough = "Cheese Dough";
		this.sauce = "Cheese Sauce";
		this.toppings.add("Cheese Topping1");
		this.toppings.add("Cheese Topping2");
		this.toppings.add("Cheese Topping3");
	}
	
	@Override
	public void box() {
		super.box();
		System.out.println("Cheese Box...");
	}
	
}
