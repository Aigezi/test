package com.aigezi.singleton.type6;

import com.aigezi.singleton.type6.Singleton;

public class Singleton06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton instance1 = Singleton.getInstance();
		
		Singleton instance2 = Singleton.getInstance();

		System.out.println(instance1 == instance2);
	}

}

//¾²Ì¬ÄÚ²¿Àà

class Singleton{
	private Singleton() {};
	
	private static class SingletonInstance{
		private static final Singleton instance = new Singleton();
	} 
	
	public static Singleton getInstance() {
		return SingletonInstance.instance;
	}
}