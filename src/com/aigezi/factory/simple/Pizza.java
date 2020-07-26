package com.aigezi.factory.simple;

public abstract class Pizza {
	
	protected String name;

	//准备
	public abstract void prepare();
	
	// 烘烤
	public void bake() {
		System.out.println(name+"is baking");
	}
	
	//切割
	public void cut() {
		System.out.println(name+"is cutting");
	}
	
	//打包
	public void box() {
		System.out.println(name+"is boxing");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
