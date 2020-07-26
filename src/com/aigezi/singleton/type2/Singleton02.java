package com.aigezi.singleton.type2;

public class Singleton02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton instance1 = Singleton.getInstance();
		
		Singleton instance2 = Singleton.getInstance();

		System.out.println(instance1 == instance2);
	}

}

//¶öººÊ½---¾²Ì¬´úÂë¿é
class Singleton{
	
	private Singleton() {}
	
	private static Singleton instance;
	
	static {
		instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}