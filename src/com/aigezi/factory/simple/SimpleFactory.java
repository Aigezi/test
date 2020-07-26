package com.aigezi.factory.simple;

public class SimpleFactory {
	
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		System.out.println("ʹ�ü򵥹���ģʽ");
		if(type.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("ϣ������");
		} else if(type.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("��������");
		} else if(type.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("��������");
		}
		return pizza;
		
	}

}
