package com.inetsoft.abstractfactory;

public class CheesePizza extends Pizza {

	public CheesePizza(PizzaIngredientFactory ingredientFactory) throws Exception {
		super(ingredientFactory);
		this.name = "CheesePizza";
		if(ingredientFactory == null) {
			throw new MessageException("No Ingredient Factory Error.");
		}
	}

	@Override
	public void prepare() {
		System.out.println("Prepare CheesePizza...");
		this.cheese = this.ingredientFactory.createCheese();
		this.sauce = this.ingredientFactory.createSauce();
	}

}
