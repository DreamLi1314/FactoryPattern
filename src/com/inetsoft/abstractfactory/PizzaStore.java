package com.inetsoft.abstractfactory;

public abstract class PizzaStore {
	
	protected PizzaIngredientFactory ingredientFactory;
	
	public PizzaStore(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}


	public Pizza orderPizza(String type) throws Exception {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	
	public abstract Pizza createPizza(String type) throws Exception;
}
