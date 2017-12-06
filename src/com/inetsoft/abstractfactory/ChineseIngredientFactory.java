package com.inetsoft.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class ChineseIngredientFactory implements PizzaIngredientFactory {
	
	private static volatile ChineseIngredientFactory factory;
	
	public static ChineseIngredientFactory getInstance() {
		if(factory == null) {
			synchronized (ChineseIngredientFactory.class) {
				if(factory == null) {
					factory = new ChineseIngredientFactory();
				}
			}
		}
		
		return factory;
	}
	
	@Override
	public Dough createDough() {
		return new ChineseDough();
	}

	@Override
	public Cheese createCheese() {
		return new ChineseCheese();
	}

	@Override
	public Clams createClams() {
		return new ChineseClams();
	}

	@Override
	public Sauce createSauce() {
		return new ChineseSauce();
	}

	@Override
	public List<Veggie> createVeggies() {
		List<Veggie> veggies = new ArrayList<>();
		Veggie veggie1 = new ChineseVeggie1();
		Veggie veggie2 = new ChineseVeggie2();
		veggies.add(veggie1);
		veggies.add(veggie2);
		
		return veggies;
	}

}
