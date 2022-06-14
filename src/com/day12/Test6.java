package com.day12;

//final�� ����� �� �ִ� 3���� case
//������ final ���: �ѹ��� �ʱ�ȭ�� ����
//�޼ҵ忡 final ���: Override �Ұ���
//Ŭ������ final ���: ��� �Ұ���

//final class Super{
class Super{
	
	public static final double PI;
	
	static {
		PI=3.14;
	}
	
	public double area;
	
	public void write(String title) {
		System.out.println(title + ":" + area);
		
	}
	
}

public class Test6 extends Super {
		
	//public void write(String title)		
	
	public void circleArea(int r) {
		area = (double)r*r*PI; //���� r�� double�� ó��
	}
	
	public static void main(String[] args) {
		
		Test6 ob = new Test6();
		
		ob.circleArea(10);
		ob.write("��");
		
		
	}

}
