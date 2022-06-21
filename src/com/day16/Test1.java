package com.day16;

import java.util.InputMismatchException;
import java.util.Scanner;

//Exception 클래스(예외처리)

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1,num2,result;
		String oper;
		
		try {
			System.out.print("두개의 수?");//10 20
			
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("연산자?");//+
			oper = sc.next();
			
			result = 0;
			if(oper.equals("+"))
				result = num1 + num2;
			else if(oper.equals("-"))
				result = num1 - num2;
			else if(oper.equals("*"))
				result = num1 * num2;
			else if(oper.equals("/"))
				result = num1 / num2;
			
			System.out.printf("%d %s %d = %d\n", num1, oper, num2, result);
			
			//처리한 결과를 e에 저장
		} catch(InputMismatchException e) {
			System.out.println(e.toString());
			System.out.println("정수로 입력해주세요");
			
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
			
		} catch (Exception e) {
			//e.printStackTrace();
			
			System.out.println("그 외 에러");
		} finally {
			System.out.println("난 다 보인다");
		}
		
	}

}
