package com.day12;

class Test{
	
	protected int a=10, b=20;
	
	public void write() {
		System.out.println("�θ� Ŭ���� write()...");
		System.out.println("a: " + a + ", b: "+ b);
	}
	
}

class Demo extends Test{
	
	protected int b=30, c=40;
	
	@Override
	public void write() {
		System.out.println("�ڽ� Ŭ���� write()...");
		System.out.println("a: " + a + ", b: "+ b + ",c: " + c);
		System.out.println("super.b: " + super.b);
	}//super.b�� �ۿ��� �ν� �Ұ�=�޼ҵ� �������� ��밡��
	
	public void print1() {
		System.out.println("�ڽ� Ŭ���� print1()...");
		write();
	}
	
	public void print2() {
		System.out.println("�ڽ� Ŭ���� print2()...");
		super.write();	
	}
	
}

public class Test4 {

	public static void main(String[] args) {

		Demo ob = new Demo();
		ob.write();
		ob.print1();//override������ ��� ����, ������ ����
		ob.print2();
		
		System.out.println(ob.b);//30
		//System.out.println(super.b);X
		
		System.out.println(((Test)ob).b);
		//ob(demo)�� Test ��, �θ�� ����ȯ �� ���� b�� ȣ��
		//=upcast
		
		((Test)ob).write();
		//������ override�� ������ �����Ƿ� �������� Test b�� ��µ�����
		//method�� override �Ǿ������Ƿ� �ƹ��� ����ȯ�� �ص� ������ �ڽ� ���� ���
		
	}

}