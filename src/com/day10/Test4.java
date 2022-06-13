package com.day10;

class Super{
	
	private String title;
	protected double area;
	
	public Super() {}//기본생성자(Recta)

	public Super(String title) {//오버로딩 생성자(Circle)
		this.title = title;
	}
	
	public void write() {
		System.out.println(title + ":" + area);
	}
	
}
//Super라는 class를 각각 Circle, Recta에게 상속
//Circle과 Recta는 관계X *JAVA는 단일상속이기 때문!!!
class Circle extends Super{
	
	private int r;
	protected static final double PI = 3.14;//final초기화 필수
	
	public Circle(int r) {
		super("원");//부모의 기본생성자를 찾아감
			this.r = r;
	}
	
	public void circleArea() {
		area = r*r*PI;
	}
	
}//Circle과 Super의 관계
//constructor 생성자
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
	//상위클래스에 정의되어있는 메소드를 재정의 한다(class의 다형성)
	//@Override
	//override시 @override로 표현 = 어노테이션(annotation)

	@Override
	public void write() {
			System.out.println("가로: " + w );
			System.out.println("세로: " + h );
			System.out.println("넓이: " + area);
	}//override는 자신것을 쓰게 됌//다형성
	
	
}
//상속이 된 클래스 내부 메소드에서만 사용이 가능

public class Test4 {

	public static void main(String[] args) {

		Circle c = new Circle(10);//새로운 객체
		c.circleArea();
		c.write();
		
		Recta r = new Recta();//새로운 객체
		r.rectArea(10, 20);
		r.write();//*5.부모와 같은 객체를 가지고있다면 내 것을 쓴다.
		//역할이 같은 메소드를 만드는 것: Override Overriding
		
	}

}