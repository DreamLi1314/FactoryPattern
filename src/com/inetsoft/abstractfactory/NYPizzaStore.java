package com.inetsoft.abstractfactory;

public class NYPizzaStore extends PizzaStore {

	public NYPizzaStore(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
	}

	@Override
	public Pizza createPizza(String type) throws Exception {
		Pizza pizza = null;
		switch (type) {
		case "Cheese":
			pizza = new CheesePizza(ingredientFactory);
			break;

		default:
			break;
		}

		return pizza;
	}

}
