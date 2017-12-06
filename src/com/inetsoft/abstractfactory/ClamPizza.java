package com.inetsoft.abstractfactory;

public class ClamPizza extends Pizza {

	public ClamPizza(PizzaIngredientFactory ingredientFactory) throws Exception {
		super(ingredientFactory);
		this.name = "ClamPizza";
		if(ingredientFactory == null) {
			throw new MessageException("No Ingredient Factory Error.");
		}
	}

	@Override
	public void prepare() {
		this.clams = this.ingredientFactory.createClams();
		this.dough = this.ingredientFactory.createDough();
		this.veggies = this.ingredientFactory.createVeggies();
	}

}
