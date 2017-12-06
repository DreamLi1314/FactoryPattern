package com.inetsoft.abstractfactory;

/**
 * Test Abstract Factory Pattern
 * @author Administrator
 *
 */
public class Simulator {
	public static void main(String[] args) throws Exception {
		PizzaStore nyStore = new NYPizzaStore(NYIngredientFactory.getInstance());
		Pizza nyPizza = nyStore.orderPizza("Cheese");
		System.out.println(nyPizza);
		
		PizzaStore chineseStore = new ChinesePizzaStore(ChineseIngredientFactory.getInstance());
		Pizza chPizza = chineseStore.orderPizza("Clam");
		System.out.println(chPizza);
	}
}
