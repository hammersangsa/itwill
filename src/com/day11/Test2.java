package com.day11;

//String : �ڷ����� �ƴ� class�̴�
//������ �����ʹ� ũ�� ���󵵴� ���⶧����
//String�� �Һ��� ��Ģ�� ������ �ִ�

public class Test2 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");//�� ��ü
	
		//*Call By Reference(�ּҰ� ���� ����)
		System.out.println("ob1==ob2: " + (ob1==ob2));//true
		System.out.println("ob1==ob3: " + (ob1==ob3));//false
		System.out.println("ob1.equals(ob3): " + ob1.equals(ob3));//false
		//String�� equals�� ��, equals�� string���� �������̵��ؼ� ���
	
		ob2 = "korea";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false
		//�Һ��� ��Ģ
		
		ob2 = "japan";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false
		//������ ���� ���ο� �ּҸ� �������� ���� �޸𸮿� ��������
		//�̸� �޸� �� ���ʿ��� value���� ó���ϴ� garbage collector�� ����
		//VM�� �����Ű�� ��� method���� ����
		ob2 = "china";
		System.out.println("ob1==ob2: " + (ob1==ob2));//false
		
		ob2 = "Seoul";
		System.out.println("ob1==ob2: " + (ob1==ob2));//true
		
		System.out.println(ob2);//
		System.out.println(ob2.toString());
		
	}

}
