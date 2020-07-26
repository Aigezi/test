package com.aigezi.factory.simple;

public abstract class Pizza {
	
	protected String name;

	//׼��
	public abstract void prepare();
	
	// �濾
	public void bake() {
		System.out.println(name+"is baking");
	}
	
	//�и�
	public void cut() {
		System.out.println(name+"is cutting");
	}
	
	//���
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
