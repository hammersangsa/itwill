package com.day11;

//Wrapper 클래스
//기본자료형을 객체로 사용할 수 있게 한다

//자료형
//boolean, byte, char, short, int, long, float, double
//자료형을 메소드처럼 쓰기 위해 class에서 사용
//Reference(class) 자료형
//Boolean, Byte, Character, Short, Integer, Float, Double

//Auto-Boxing: (Stack 에 있는 Int 값이 Heap영역으로 가서 처리됌)
//Auto-UnBoxing; (Heap 에서 Stack으로)

public class Test7 {

	public static void main(String[] args) {

		int a = 24;
		
		//Integer b = 24;
		//ref class
		System.out.println(a + 10);//24
		System.out.println(Integer.toString(a) + 10);//2410
		System.out.println(Integer.toString(a,2));//2진수문자
		System.out.println(Integer.toString(a,16));
		
		
		int n1 = 10;
		int n2;
		Integer num1;
		Integer num2 = new Integer(20);
		
		num1 = n1;//오토박싱
		n2 = num2;//오토언박싱
		
		System.out.println(n1 + ":" + num1);
		System.out.println(n2 + ":" + num2);
		
		int c = 10;
		float d;
		
		d = c;
		
	}

}

/*
 int a = 10;
 float b;
 
 b = a;  		암시적 형변환(10.0)	--O_ex)정수가 실수로 변환됌
 b = (float)a;	명시적 형변환	   	--O
 
 a = b;			에러			   	--X
 a = (int)b;	명시적 형변환	   	--O
 -------------------------------------------------------------
 B(부모) - A(자식)
 
 B = A;			UPCAST	   	--O
 B = (B)A;		명시적 UPCAST		--O
 
 A = B;			에러				--X
 A = (A)B		명시적 DOWNCAST		--O
 
 */






























