package com.day8;

//static
//�˾Ƽ� �޸𸮿� �ö󰡰���(�޸� �Ҵ� ����)
//��ü�� 1000�� �����ص� �޸� ������ 1��



public class Test2 {
	//static Ư¡
	public static int a =10; //class����
	//Ŭ�������� �Ǵ� Ŭ�����޼ҵ� /Ŭ������ �ε��Ǵ¼���
	//�޸� �Ҵ��� �̷������ [Ŭ�����̸�.��ü]�� ���ؼ� ������ ����
	//��, new�� ���ؼ� �޸� �Ҵ��� ���� �ʾƵ� ��� �����ϴ�
	
	
	public int b =20;		//instance ����
	//�ν��Ͻ� ������ new�� ���ؼ� �޸� �Ҵ��� �޾ƾ߸�
	//����� �����ϰ� Ŭ���� �޼ҵ忡���� ������ �Ұ����ϴ�
	//���� Ŭ���� �ȿ��� ������ ����������
	
	public void write() { //instance �޼ҵ�
		System.out.println("class����: " + a);
		System.out.println("instance����: " + b);
		
		
	}
	
	public static void print() { // class�޼ҵ�
		System.out.println("class����: " + a);
		//System.out.println("instance����: " + b);
		
	}
	
	public static void main(String[] args) {

		System.out.println("class����: " + a);
		System.out.println("class����: " + Test2.a);
		//Test2��� Ŭ������ a�� ��(class����)
		
		//write();
		print();
		Test2.print();
		
		Test2 ob = new Test2();
		//�ε��� ��ü ������ ����
		//�ε��� �� ū ����(��ü ���� ��)
		//new(��ü)�� ���� static�� ���� �޼ҵ�,�������� �޸� �� �÷���
		System.out.println(ob.a);
		System.out.println(Test2.a);
		ob.write();
		ob.print();
		Test2.print();
		
		System.out.println(ob.a);//10
		System.out.println(ob.b);//20
		
		System.out.println("=====================");
		
		Test2 ob1 = new Test2();
		
		ob1.a = 500;
		ob1.b = 200;
		System.out.println(ob1.a);//100
		System.out.println(ob1.b);//200
		System.out.println("=====================");
		
		Test2 ob2 = new Test2();
		System.out.println(ob2.a);//100
		System.out.println(ob2.b);//20
		System.out.println("=====================");
		Test2 ob3 = new Test2();
		System.out.println(ob3.a);//100
		System.out.println(ob3.b);//20
		//static = �޸� ������ 1���� ���� ������ ���
		
		
		
		
	}

}
