package com.day10;
//상속(부모가 자식한테 주는 것)
/*상속의 개념
 *1.부모것은 내것이다.
 *2.private으로 선언한 것은 상속이 불가능하다.
 *3.protected로 선언한 것은 상속이 가능하다.
 *4.내 것은 내 것이다.
 *5.부모와 같은 객체를 가지고있다면 내 것을 쓴다.
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


class Rect extends SuperC{//SuperC부모 호출
	
	private int w, h;
	
	public Rect(int w, int h) { //overloading
		this.w = w;
		this.h = h;
	}
	public void rectArea() {
		
		int a = w*h;
		set("사각형", a);//1.부모것은 내거다
	}

}


public class Test1 {//Rect 자식 호출

	public static void main(String[] args) {

		Rect ob = new Rect(10, 20);
		
		ob.rectArea();
		
		ob.print();
	}

}
