package com.day12;

//�߻� Ŭ����;�������̽�
//�޸��� ������� Ŭ������ �̸� ����
//�޼ҵ带 ������ �ؼ� ����Ѵ�

abstract class ShapeClass{//�߻�Ŭ���� �߻�޼ҵ� �ϳ��� �ʼ��� ��������
	
	public abstract void draw(); //�߻�޼ҵ�
		//�⺻ �޼ҵ嵵 ���� ����
	
}

class Cir extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("���� �׸���...");
	}
}

class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("�簢���� �׸���...");
	}
}

class Tri extends ShapeClass{
	
	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���...");
	}
	
}

public class Test7{

	
	public static void main(String[] args) {
	
		Cir c = new Cir();
		Rect r = new Rect();
		Tri t = new Tri();
		
		c.draw();
		r.draw();
		t.draw();
		
	}

}
