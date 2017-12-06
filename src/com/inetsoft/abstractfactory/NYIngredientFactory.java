package com.inetsoft.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class NYIngredientFactory implements PizzaIngredientFactory {

	private static volatile NYIngredientFactory factory;
	
	public static NYIngredientFactory getInstance() {
		if(factory == null) {
			synchronized (NYIngredientFactory.class) {
				if(factory == null) {
					factory = new NYIngredientFactory();
				}
			}
		}
		
		return factory;
	}
	
	
	@Override
	public Dough createDough() {
		return new NYDough();
	}

	@Override
	public Cheese createCheese() {
		return new NYCheese();
	}

	@Override
	public Clams createClams() {
		return new NYClams();
	}

	@Override
	public Sauce createSauce() {
		return new NYSauce();
	}

	@Override
	public List<Veggie> createVeggies() {
		List<Veggie> veggies = new ArrayList<>();
		Veggie veggie1 = new NYVeggie1();
		Veggie veggie2 = new NYVeggie2();
		veggies.add(veggie1);
		veggies.add(veggie2);
		
		return veggies;
	}

}
