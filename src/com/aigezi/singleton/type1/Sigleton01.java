package com.aigezi.singleton.type1;

public class Sigleton01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 测试
		Singleton instance1 = Singleton.getInstance();
		
		Singleton instance2 = Singleton.getInstance();

		System.out.println(instance1 == instance2);
	}

}

//饿汉式-------静态常量

class Singleton{
	//1，构造器私有化
	
	private Singleton() {}
	
	//2,本类内部创建对象实例
	
	private final static Singleton instance = new Singleton();
	
	//3,提供一个公有的静态方法，返回对象实例
	public static Singleton getInstance() {
		return instance;
	}
}
