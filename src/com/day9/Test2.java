package com.day9;

import java.util.Scanner;

/*생성자
 *new "생성자();" 객체를 새로 만들 때.
 *이유
 *1.메모리 할당
 *2.변수 초기화
 
 *특징
 *class의 이름과 동일
 *리턴값이 없기때문에 property가 없다
 *생성자도 중복정의가 가능하다
 
 *생성자에서 다른 생성자를 호출 할 수 있다
 *단, 맨 앞 부분에서 한번만 호출 가능하다
 */

public class Test2 {

	private int x;
	
	public Test2() {}//기본생성자
		
		//this(30); //Test2의 대명사 this 한번만 호출
		
		//System.out.println("기본생성자..!");
		//x = 10;
		//System.out.println("x: "+x);
		
	//}
	
	public Test2(int x) {//생성자 중복 정의
		
		//this();
		
		//System.out.println("오버로딩된 생성자...");
		
		this.x = x;
		//System.out.println("x: "+x);

		
	}
	
	public void setData(int x) {
		this.x = x;
	}
	
	
	public static void main(String[] args) {

		Test2 ob1 = new Test2();
		
		System.out.println(ob1.x);//0
		ob1.setData(100);
		
		System.out.println(ob1.x);//100
		//객체 생성 후 데이터set 후 사용
		//----------------------------
		Test2 ob2 = new Test2(20);
		System.out.println(ob2.x);
		//객체 생성과 set을 동시에 처리 후 출력
		//overloading된 생성자
		ob2.setData(4);
		System.out.println(ob2.x);
		
		
		Test2 ob3 = new Test2();
		Test2 ob4 = new Test2(60);
		//메모리 할당 중
		//기본 생성자를 오버로딩 해두면 
		//에러가 나기에 기본 생성자를 명시
	
	}

}
