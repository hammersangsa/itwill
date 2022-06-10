package com.day10;
//���(�θ� �ڽ����� �ִ� ��)
/*����� ����
 *1.�θ���� �����̴�.
 *2.private���� ������ ���� ����� �Ұ����ϴ�.
 *3.protected�� ������ ���� ����� �����ϴ�.
 *4.�� ���� �� ���̴�.
 *5.�θ�� ���� ��ü�� �������ִٸ� �� ���� ����.
*/
class SuperB{
	
	private String title;
	//2.private���� ������ ���� ����� �Ұ����ϴ�.

	protected int area;//��ӹ��� ���� �������� ��밡���� ����
	//area�� protected�� �����Ͽ� set���� ���� area�� ������ �ʿ䰡 ����.
	public void set(String title) {
		this.title = title;		
	}

	public void print() {
		System.out.println(title + ":" + area);
	}
	
}


class RectB extends SuperB{//SuperB�θ� ȣ��
	
	private int w, h;
	
	public RectB(int w, int h) { //overloading
		this.w = w;
		this.h = h;
	}
	public void rectArea() {
		
		area = w*h; //3.protected�� ������ ���� ����� �����ϴ�.
		set("�簢��");//1.�θ���� ���Ŵ�
		
		
	}
	
}



public class Test2 {//RectB �ڽ� ȣ��

	public static void main(String[] args) {

		RectB ob = new RectB(100, 200);
		
		ob.rectArea();
		
		ob.print();
		
		
		
		
		
		
		
	}

}
