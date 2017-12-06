package com.inetsoft.factorymethod;

public class Simulator {
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore cgPizzaStore = new ChicagoPizzaStore();
		
		Pizza chPizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("I get pizza " + chPizza.getName());
		
		System.out.println("------------------------------------------");
		
		Pizza ppPizza = cgPizzaStore.orderPizza("pepperoni");
		System.out.println("I get pizza " + ppPizza.getName());
	}
}
