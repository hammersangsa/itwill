package com.day7;
//1개 파일에 여러개의 class파일 생성
//public 생략 method 혹은 instance 변수 
//둘 중 하나만 생성해도 되고 둘다 생성해도 된다.
class Sub{
	
	int a,b;
	//작업이 없으므로 보관목적
}

public class Test2 {

	public static void main(String[] args) {
		Sub ob1 = new Sub();
		Sub ob2 = new Sub();
		
		System.out.println("ob1.a: " + ob1.a);//0
		System.out.println("ob1.b: " + ob1.b);//0

		ob1.a=10;
		ob1.b=20;
		
		System.out.println("ob1.a: " + ob1.a);//10
		System.out.println("ob1.b: " + ob1.b);//20
		
		ob2.a=100;
		ob2.b=200;
		
		System.out.println("ob2.a: " + ob2.a);//100
		System.out.println("ob2.b: " + ob2.b);//200
	}

}
