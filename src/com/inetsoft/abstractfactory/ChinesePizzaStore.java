package com.inetsoft.abstractfactory;

public class ChinesePizzaStore extends PizzaStore {

	public ChinesePizzaStore(PizzaIngredientFactory ingredientFactory) {
		super(ingredientFactory);
	}

	@Override
	public Pizza createPizza(String type) throws Exception {
		Pizza pizza = null;
		switch (type) {
		case "Clam":
			pizza = new ClamPizza(ingredientFactory);
			break;

		default:
			break;
		}

		return pizza;
	}

}
