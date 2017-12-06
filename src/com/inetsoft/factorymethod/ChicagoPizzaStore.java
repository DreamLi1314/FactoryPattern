package com.inetsoft.factorymethod;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch (type) {
		case "veggie":
			pizza = new VeggiePizza();
			break;
		case "pepperoni":
			pizza = new PepperoniPizza();
			break;

		default:
			break;
		}

		return pizza;
	}

}
