package com.inetsoft.factorymethod;


public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch (type) {
		case "cheese":
			pizza = new CheesePizza();
			break;
		case "clam":
			pizza = new ClamPizza();
			break;

		default:
			break;
		}

		return pizza;
	}

}
