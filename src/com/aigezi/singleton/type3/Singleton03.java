package com.aigezi.singleton.type3;

public class Singleton03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// 懒汉式---线程不安全

class Singleton{
	
	private Singleton() {}
	
	private static Singleton instance;
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
}