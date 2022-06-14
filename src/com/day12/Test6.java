package com.day12;

//final을 사용할 수 있는 3가지 case
//변수에 final 사용: 한번만 초기화가 가능
//메소드에 final 사용: Override 불가능
//클래스에 final 사용: 상속 불가능

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
		area = (double)r*r*PI; //앞의 r만 double로 처리
	}
	
	public static void main(String[] args) {
		
		Test6 ob = new Test6();
		
		ob.circleArea(10);
		ob.write("원");
		
		
	}

}
