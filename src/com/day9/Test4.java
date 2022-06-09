package com.day9;

public class Test4 {

	int a = 5;
	
	//초기화 블럭
	//한번만 실행되는 객체들을 정리
	{
		System.out.println("초기화 블럭a :" + a);
		a = 10;
		System.out.println("초기화 블럭a :" + a);
	
	}
	//오직 변수만 초기화 블럭 외부에 사용 가능
	
	static int b;
	static {//static 블럭
		b = 10;
		System.out.println("초기화 블럭b :" + b);
	}
	
	final int C;//상수변수-변하지 않는 값에 설정
	//초기화한 값은 프로그램 종료 시까지 변함X
	//항상성
	public Test4() {
		System.out.println("생성자..");
		C = 100;
		System.out.println("C : " + C);
	}
	
	public static void main(String[] args) {

		Test4 ob1 = new Test4();
		Test4 ob2 = new Test4();

		
		//순서: static - new(instance변수, 메소드) - 생성자
		
	}

}
