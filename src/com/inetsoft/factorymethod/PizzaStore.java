package com.inetsoft.factorymethod;

/**
 * 工厂方法模式实现的Pizza店
 * @author Dream Li
 *
 */
public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		
		pizza = this.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);
	
	
}
