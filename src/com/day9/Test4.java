package com.day9;

public class Test4 {

	int a = 5;
	
	//�ʱ�ȭ ��
	//�ѹ��� ����Ǵ� ��ü���� ����
	{
		System.out.println("�ʱ�ȭ ��a :" + a);
		a = 10;
		System.out.println("�ʱ�ȭ ��a :" + a);
	
	}
	//���� ������ �ʱ�ȭ �� �ܺο� ��� ����
	
	static int b;
	static {//static ��
		b = 10;
		System.out.println("�ʱ�ȭ ��b :" + b);
	}
	
	final int C;//�������-������ �ʴ� ���� ����
	//�ʱ�ȭ�� ���� ���α׷� ���� �ñ��� ����X
	//�׻�
	public Test4() {
		System.out.println("������..");
		C = 100;
		System.out.println("C : " + C);
	}
	
	public static void main(String[] args) {

		Test4 ob1 = new Test4();
		Test4 ob2 = new Test4();

		
		//����: static - new(instance����, �޼ҵ�) - ������
		
	}

}
