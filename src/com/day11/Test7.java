package com.day11;

//Wrapper Ŭ����
//�⺻�ڷ����� ��ü�� ����� �� �ְ� �Ѵ�

//�ڷ���
//boolean, byte, char, short, int, long, float, double
//�ڷ����� �޼ҵ�ó�� ���� ���� class���� ���
//Reference(class) �ڷ���
//Boolean, Byte, Character, Short, Integer, Float, Double

//Auto-Boxing: (Stack �� �ִ� Int ���� Heap�������� ���� ó����)
//Auto-UnBoxing; (Heap ���� Stack����)

public class Test7 {

	public static void main(String[] args) {

		int a = 24;
		
		//Integer b = 24;
		//ref class
		System.out.println(a + 10);//24
		System.out.println(Integer.toString(a) + 10);//2410
		System.out.println(Integer.toString(a,2));//2��������
		System.out.println(Integer.toString(a,16));
		
		
		int n1 = 10;
		int n2;
		Integer num1;
		Integer num2 = new Integer(20);
		
		num1 = n1;//����ڽ�
		n2 = num2;//�����ڽ�
		
		System.out.println(n1 + ":" + num1);
		System.out.println(n2 + ":" + num2);
		
		int c = 10;
		float d;
		
		d = c;
		
	}

}

/*
 int a = 10;
 float b;
 
 b = a;  		�Ͻ��� ����ȯ(10.0)	--O_ex)������ �Ǽ��� ��ȯ��
 b = (float)a;	����� ����ȯ	   	--O
 
 a = b;			����			   	--X
 a = (int)b;	����� ����ȯ	   	--O
 -------------------------------------------------------------
 B(�θ�) - A(�ڽ�)
 
 B = A;			UPCAST	   	--O
 B = (B)A;		����� UPCAST		--O
 
 A = B;			����				--X
 A = (A)B		����� DOWNCAST		--O
 
 */






























