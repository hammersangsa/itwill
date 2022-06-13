package com.day10;

class Super{
	
	private String title;
	protected double area;
	
	public Super() {}//�⺻������(Recta)

	public Super(String title) {//�����ε� ������(Circle)
		this.title = title;
	}
	
	public void write() {
		System.out.println(title + ":" + area);
	}
	
}
//Super��� class�� ���� Circle, Recta���� ���
//Circle�� Recta�� ����X *JAVA�� ���ϻ���̱� ����!!!
class Circle extends Super{
	
	private int r;
	protected static final double PI = 3.14;//final�ʱ�ȭ �ʼ�
	
	public Circle(int r) {
		super("��");//�θ��� �⺻�����ڸ� ã�ư�
			this.r = r;
	}
	
	public void circleArea() {
		area = r*r*PI;
	}
	
}//Circle�� Super�� ����
//constructor ������
class Recta extends Super{
	
	private int w, h;
	
	public Recta() {
		super();
	}
	
	public void rectArea(int w, int h) {
		this.w = w;
		this.h = h;
		
		area = w*h;
	}
	//Override
	//����Ŭ������ ���ǵǾ��ִ� �޼ҵ带 ������ �Ѵ�(class�� ������)
	//@Override
	//override�� @override�� ǥ�� = ������̼�(annotation)

	@Override
	public void write() {
			System.out.println("����: " + w );
			System.out.println("����: " + h );
			System.out.println("����: " + area);
	}//override�� �ڽŰ��� ���� ��//������
	
	
}
//����� �� Ŭ���� ���� �޼ҵ忡���� ����� ����

public class Test4 {

	public static void main(String[] args) {

		Circle c = new Circle(10);//���ο� ��ü
		c.circleArea();
		c.write();
		
		Recta r = new Recta();//���ο� ��ü
		r.rectArea(10, 20);
		r.write();//*5.�θ�� ���� ��ü�� �������ִٸ� �� ���� ����.
		//������ ���� �޼ҵ带 ����� ��: Override Overriding
		
	}

}