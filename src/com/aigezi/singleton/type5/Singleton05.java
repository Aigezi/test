package com.aigezi.singleton.type5;

import com.aigezi.singleton.type5.Singleton;

public class Singleton05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Singleton instance1 = Singleton.getInstance();
		
		Singleton instance2 = Singleton.getInstance();

		System.out.println(instance1 == instance2);
	}

}

//Ë«ÖØ¼ì²é

class Singleton {
	private Singleton() {}
	
	private static volatile Singleton instance;
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		
		return instance;
	}
}