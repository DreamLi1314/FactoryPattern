package com.inetsoft.abstractfactory;

/**
 * @Description: Test Abstract Factory Pattern
 * @Warning: 
 * @Author DreamLi
 * @Package FactoryPattern  --  com.inetsoft.abstractfactory.Simulator
 * @Date: 2017年12月7日 上午8:02:33
 * @Version: 1.0.0
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
