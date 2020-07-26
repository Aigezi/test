package com.aigezi.singleton.type7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.aigezi.singleton.type7.Singleton;

public class Singleton07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton instance1 = Singleton.INSTANCE;
		
		Singleton instance2 = Singleton.INSTANCE;
		instance1.sayhello();
		System.out.println(instance1 == instance2);
		String a = new String("myString");
	    String b = "myString";
	    String c = "my" + "String";
	    String d = c;
	    System.out.print(a == b);
	    System.out.print(a == c);
	    System.out.print(b == c);
	    System.out.print(b == d);
	    
	    
	    Map<String,String> map = Collections.synchronizedMap(new HashMap<>());
	}

}

// 单例模式----枚举

enum Singleton{
	INSTANCE;
	public void sayhello() {
		System.out.println("hello");
	}
}