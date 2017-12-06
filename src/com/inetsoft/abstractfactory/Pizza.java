package com.inetsoft.abstractfactory;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Cheese cheese;
	protected Clams clams;
	protected Sauce sauce;
	protected List<Veggie> veggies;
	protected PizzaIngredientFactory ingredientFactory;
	
	public Pizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public abstract void prepare();

	public void bake() {
		System.out.println("Pizza bake...");
	}

	public void cut() {
		System.out.println("Pizza cut...");
	}

	public void box() {
		System.out.println("Pizza box...");
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("Pizza " + "[name=" + name);
		if(dough != null) {
			str.append(", dough=" + dough);
		}
		
		if(cheese != null) {
			str.append(", cheese=" + cheese);
		}
		
		if(clams != null) {
			str.append(", clams=" + clams);
		}
		
		if(sauce != null) {
			str.append(", sauce=" + sauce);
		}
		
		if(veggies != null) {
			str.append(", veggie=");
			String veggiesName = veggies.stream()
				   .map(Veggie::getName)
				   .collect(Collectors.joining(", ", "<", ">"));
			str.append(veggiesName);
		}
		
		str.append("]");
		
		return str.toString();
	}
	
	
}
