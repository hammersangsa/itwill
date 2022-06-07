package com.day7;

public class Test1 {

	public static void main(String[] args) {

		Rect ob1 = new Rect();//같은 패키지 안에 있으면 import 불필요
		Rect ob2 = new Rect();

		ob1.input();
		ob2.input();
		//
		int a = ob1.area();
		int l = ob1.length();
		ob1.print(a, l);
		//int 값이 중요함 자료형이 일치되어야함 (변수는 지정 상관없음)
		
		
		a = ob2.area();
		l = ob2.length();
		ob2.print(a, l);
		//변수 a, l은 위에서 print되었기떄문에
		//재사용해서 사용할 수 있다.
	}

}
