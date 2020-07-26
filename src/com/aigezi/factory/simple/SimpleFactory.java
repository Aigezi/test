package com.aigezi.factory.simple;

public class SimpleFactory {
	
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		System.out.println("使用简单工厂模式");
		if(type.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("希腊披萨");
		} else if(type.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("奶酪披萨");
		} else if(type.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("胡椒披萨");
		}
		return pizza;
		
	}

}
