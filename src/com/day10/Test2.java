package com.day10;
//상속(부모가 자식한테 주는 것)
/*상속의 개념
 *1.부모것은 내것이다.
 *2.private으로 선언한 것은 상속이 불가능하다.
 *3.protected로 선언한 것은 상속이 가능하다.
 *4.내 것은 내 것이다.
 *5.부모와 같은 객체를 가지고있다면 내 것을 쓴다.
*/
class SuperB{
	
	private String title;
	//2.private으로 선언한 것은 상속이 불가능하다.

	protected int area;//상속받은 관계 내에서만 사용가능한 변수
	//area는 protected로 설정하여 set내의 따로 area를 지정할 필요가 없다.
	public void set(String title) {
		this.title = title;		
	}

	public void print() {
		System.out.println(title + ":" + area);
	}
	
}


class RectB extends SuperB{//SuperB부모 호출
	
	private int w, h;
	
	public RectB(int w, int h) { //overloading
		this.w = w;
		this.h = h;
	}
	public void rectArea() {
		
		area = w*h; //3.protected로 선언한 것은 상속이 가능하다.
		set("사각형");//1.부모것은 내거다
		
		
	}
	
}



public class Test2 {//RectB 자식 호출

	public static void main(String[] args) {

		RectB ob = new RectB(100, 200);
		
		ob.rectArea();
		
		ob.print();
		
		
		
		
		
		
		
	}

}
