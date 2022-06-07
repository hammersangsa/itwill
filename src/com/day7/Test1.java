package com.day7;

public class Test1 {

	public static void main(String[] args) {

		Rect ob = new Rect();//같은 패키지 안에 있으면 import 불필요
		
		ob.input();
		int a = ob.area();
		int l = ob.length();
		ob.print(a, l);
	
		
		
		
	}

}
