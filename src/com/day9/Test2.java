package com.day9;

import java.util.Scanner;

/*������
 *new "������();" ��ü�� ���� ���� ��.
 *����
 *1.�޸� �Ҵ�
 *2.class�� ���� �ʱ�ȭ == Spring(������ ����)
 
 *Ư¡
 *class�� �̸��� ����
 *���ϰ��� ���⶧���� property�� ����
 *�����ڵ� �ߺ����ǰ� �����ϴ�
 
 *�����ڿ��� �ٸ� �����ڸ� ȣ�� �� �� �ִ�
 *��, �� �� �κп��� �ѹ��� ȣ�� �����ϴ�
 */

public class Test2 {

	private int x;
	
	public Test2() {}//�⺻������
		
		//this(30); //Test2�� ���� this �ѹ��� ȣ��
		
		//System.out.println("�⺻������..!");
		//x = 10;
		//System.out.println("x: "+x);
		
	//}
	
	public Test2(int x) {//������ �ߺ� ����
		
		//this();
		
		//System.out.println("�����ε��� ������...");
		
		this.x = x;
		//System.out.println("x: "+x);

		
	}
	
	public void setData(int x) {
		this.x = x;
	}
	
	
	public static void main(String[] args) {

		Test2 ob1 = new Test2();
		
		System.out.println(ob1.x);//0
		ob1.setData(100);
		
		System.out.println(ob1.x);//100
		//��ü ���� �� ������set �� ���
		//----------------------------
		Test2 ob2 = new Test2(20);
		System.out.println(ob2.x);
		//��ü ������ set�� ���ÿ� ó�� �� ���
		//overloading�� ������
		ob2.setData(4);
		System.out.println(ob2.x);
		
		
		Test2 ob3 = new Test2();
		Test2 ob4 = new Test2(60);
		//�޸� �Ҵ� ��
		//�⺻ �����ڸ� �����ε� �صθ� 
		//������ ���⿡ �⺻ �����ڸ� ���
	
	}

}
