package com.day10;
//������ ����
class SuperD{
	
	private String title;
	protected int area;
	//�⺻ ������
	//public SuperD() {}//�⺻ ������
	public SuperD(String title)	{
		this.title = title;
	}
	
	public void print() {
		System.out.println(title+":"+area);
	}
	
}

class RectD extends SuperD{
	
	private int w, h;
	public RectD(int w ,int h) {
		super("�簢��");//���ο� �ѹ��� ���
	//public RectD() {//this()=�����ε��� �����ڿ��� �⺻������ ������ ��
		//super("a");//������ ���� �������ִ� ��
		this.w = w;
		this.h = h;
		
	}
	
	public void rectArea() {
		area = w*h;
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		
		RectD ob = new RectD(15,20);
		
		ob.rectArea();
		ob.print();
	}

}
