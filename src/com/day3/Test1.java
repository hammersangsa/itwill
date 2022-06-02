package com.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {

		//선언
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num1 , num2;
		
		System.out.print("첫번째 수?");//100
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 수?");//200
		num2 = Integer.parseInt(br.readLine());
		
		//\t(tab)는 정규화 표현식
		System.out.printf("%d + %d = %d\t", num1, num2, num1+num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
		System.out.printf("%d * %d = %d\t", num1, num2, num1*num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);//몫
		System.out.printf("%d %% %d = %d\n", num1, num2, num1%num2);//나머지
		
		// >, <, >=, <=, ==
		//'숫자를 부등호로 비교하면 true 또는 false문자가 생성된다'
		System.out.println("num1>num2 : " + (num1>num2));
		System.out.println();
	}

}
