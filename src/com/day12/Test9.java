package com.day12;

class TestA{
	public void print() {
		System.out.println("TestA Ŭ����");
	}
}

class TestB{
	public void print() {
		System.out.println("TestB Ŭ����");
	}
}


public class Test9 {

	public static void main(String[] args) {

		TestA a = new TestA();
		TestB b;
		//TestA�� TestB�� �ٸ� �ڷ����̱� ������ a=b b=a �ƹ��͵� �ȉ�
		
		//b = a;
		//b = (TestB)a;
		//���ó�� �������� �־����
	}

}
