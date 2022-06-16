package com.day13;

//2.내부 클래스(Local)
//클래스 내의 메소드 내의 클래스를 생성
class Outer2{
	
	static int a = 10;
	int b = 20;
	
	public void write() {
		
		int c = 30;
		final int d =40;
		
		class Inner2{//local class//outer가 생겼다고 inner객체생성X
			
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
		
		}
		
		Inner2 ob = new Inner2();
		ob.print();
	}
	
}


public class Test5 {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		out.write();
		
	}

}
