package com.day10;
//개념을 이해
class SuperD{
	
	private String title;
	protected int area;
	//기본 생성자
	//public SuperD() {}//기본 생성자
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
		super("사각형");//선두에 한번만 사용
	//public RectD() {//this()=오버로딩된 생성자에서 기본생성자 생성할 때
		//super("a");//생성자 내에 숨겨져있는 것
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
