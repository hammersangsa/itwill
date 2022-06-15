package com.day13;

//3.내부 클래스(중첩)
//클래스 내의 클래스를 생성
class Outer3{
	
	static int a = 10;
	int b = 20;
	
	public static class Inner3{
		
		int c = 30;
		
		public void write() {
			System.out.println(a);
			//System.out.println(b);
			System.out.println(c);
			
			Outer3 ob = new Outer3();
			System.out.println(ob.b);
		}
	}
	
}

public class Test6 {

	public static void main(String[] args) {

		Outer3 out = new Outer3();
		
		Outer3.Inner3 inner = new Outer3.Inner3();
		inner.write();
		
		
	}

}
