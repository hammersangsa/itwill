package com.day2;

public class Test2 {

	public static void main(String[] args) {
		
		//자료형(숫자) : int (정수)
		//num1 : 변수명
		int num1 = 20;//변수 선언하면서 초기화
		int num2; //선언하고 초기화
		num2 = 10;
		
		int num3, num4;//trash value
		
		System.out.println(num1);
		System.out.println(num2);
		//System.out.println(num3);//컴파일 오류(쓰레기값 안보여줌)
		//System.out.println(num4);
		
		num3 = num1 + num2;
		System.out.println(num3);
		
		num4 = num1 - num2;
		System.out.println(num4);
		
		System.out.println(num1 + "+" + num2 + "=" + num3);
		//System.out.printf("%d+%d=%d%n", num1, num2, num3);
		System.out.println(num1 + "-" + num2 + "=" + num4);
		
		num1 = 200;
		num2 = 100;
		System.out.println(num1 + "+" + num2 + "=" + num3);
		System.out.println(num1 + "-" + num2 + "=" + num4);
		
		//format 
		System.out.printf("%d+%d=%d%n",num1, num2, num3);
		System.out.printf("%d-%d=%d",num1, num2, num4);

	}
}
//출력의 방식