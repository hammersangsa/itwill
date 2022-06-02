package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) throws IOException {

		//선언
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		char oper;
		
		//입력
		System.out.println("첫번째 숫자는?");
		num1 = sc.nextInt();
		
		System.out.println("두번째 숫자는?");
		num2 = sc.nextInt();
		
		System.out.print("연산자[+,-,*,/] 중 고르세요");//+
		oper = (char)System.in.read();
		
		//switch
		switch(oper) {//char의 표기는 ' ' 를 사용
		case '+':
			System.out.printf("%d %c %d = %d", num1, oper, num2, (num1+num2));
			break;
		case '-':
			System.out.printf("%d %c %d = %d", num1, oper, num2, (num1-num2));
			break;	
		case '*':
			System.out.printf("%d %c %d = %d", num1, oper, num2, (num1*num2));
			break;
		case '/':
			System.out.printf("%d %c %d = %d", num1, oper, num2, (num1/num2));
			break;
			default:
				System.out.println("잘못된 연산자입니다");
		}
		
	}

}
