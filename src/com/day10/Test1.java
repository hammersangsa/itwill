package com.day10;
//���(�θ� �ڽ����� �ִ� ��)
/*����� ����
 *1.�θ���� �����̴�.
 *2.private���� ������ ���� ����� �Ұ����ϴ�.
 *3.protected�� ������ ���� ����� �����ϴ�.
 *4.�� ���� �� ���̴�.
 *5.�θ�� ���� ��ü�� �������ִٸ� �� ���� ����.
*/
class SuperC{
	
	private String title;
	private int area;
	
	public void set(String title, int area) {
		this.title = title;
		this.area =area;		
	}

	public void print() {
		System.out.println(title + ":" + area);
	}
	
}


class Rect extends SuperC{//SuperC�θ� ȣ��
	
	private int w, h;
	
	public Rect(int w, int h) { //overloading
		this.w = w;
		this.h = h;
	}
	public void rectArea() {
		
		int a = w*h;
		set("�簢��", a);//1.�θ���� ���Ŵ�
	}

}


public class Test1 {//Rect �ڽ� ȣ��

	public static void main(String[] args) {

		Rect ob = new Rect(10, 20);
		
		ob.rectArea();
		
		ob.print();
	}

}
