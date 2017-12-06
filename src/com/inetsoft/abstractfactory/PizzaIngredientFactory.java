package com.inetsoft.abstractfactory;

import java.util.List;
/**
 * Ingredient Factory
 * @author Administrator
 *
 */
public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Cheese createCheese();
	public Clams createClams();
	public Sauce createSauce();
	public List<Veggie> createVeggies();
	
}
