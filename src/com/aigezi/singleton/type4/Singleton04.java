package com.aigezi.singleton.type4;

public class Singleton04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// 懒汉模式-----线程安全，同步方法

class Singleton{
	private Singleton() {}
	
	private static Singleton instance;
	
	public static synchronized Singleton getInstance() {
		
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
}