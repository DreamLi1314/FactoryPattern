package com.inetsoft.simplefactory;
/**
 * 简单工厂
 * @author Administrator
 *
 */
public class SimplePizzaFactory {

	private static volatile SimplePizzaFactory factory;

	private SimplePizzaFactory() {
		super();
	}

	public static SimplePizzaFactory newInstance() {
		if (factory == null) {
			synchronized (SimplePizzaFactory.class) {
				if (factory == null) {
					factory = new SimplePizzaFactory();
				}
			}
		}

		return factory;
	}

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch (type) {
		case "cheese":
			pizza = new CheesePizza();
			break;
		case "clam":
			pizza = new ClamPizza();
			break;
		case "veggie":
			pizza = new VeggiePizza();
			break;
		case "pepperoni":
			pizza = new PepperoniPizza();
			break;

		default:
			break;
		}

		return pizza;
	}

}
