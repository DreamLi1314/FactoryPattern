package com.inetsoft.simplefactory;

public class Simulator {
	public static void main(String[] args) {

		SimplePizzaFactory factory = SimplePizzaFactory.newInstance();
		PizzaStore pizzaStore = new NYPizzaStore(factory);

		Pizza pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza);

	}
}
