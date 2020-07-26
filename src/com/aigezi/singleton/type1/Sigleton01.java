package com.aigezi.singleton.type1;

public class Sigleton01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����
		Singleton instance1 = Singleton.getInstance();
		
		Singleton instance2 = Singleton.getInstance();

		System.out.println(instance1 == instance2);
	}

}

//����ʽ-------��̬����

class Singleton{
	//1��������˽�л�
	
	private Singleton() {}
	
	//2,�����ڲ���������ʵ��
	
	private final static Singleton instance = new Singleton();
	
	//3,�ṩһ�����еľ�̬���������ض���ʵ��
	public static Singleton getInstance() {
		return instance;
	}
}
