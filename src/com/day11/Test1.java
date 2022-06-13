package com.day11;

//Object: Super class of all class
class Test {
	//extends Object�� �⺻������ ����
	private int a = 10;
	
	public void write() {
		System.out.println("a: " + a);
	}
	
	
}

public class Test1 {

	public static void main(String[] args) {

	Test ob1 = new Test();
	Test ob2 = new Test();
	
	System.out.println("ob1==ob2: " + (ob1==ob2));
	//==�� ob1�� ob2�� "�ּҰ�"�� ���Ͽ� ���İ� ����� ��.	
	System.out.println("ob1.equals(ob2): " + ob1.equals(ob2));
	
	//������ ���� �ּҸ� �ؽ��ڵ��� Ī��.
	//�ؽ��ڵ�[class name@hashcode]
	System.out.println("ob1: " + ob1);//com.day11.Test@7852e922 �ּҿ� ����
	System.out.println("ob2: " + ob2);//com.day11.Test@4e25154f �ּҿ� ����
	
	//ob1�� ���� toString(����ȭ)�Ͽ� ����ض�.
	System.out.println("ob1.toString(): " + ob1.toString());
	
	}

}
