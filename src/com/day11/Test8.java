package com.day11;

import java.io.IOException;
import java.util.Scanner;

class Sum {
	
	protected int num1, num2, result;
	protected String oper;
		
	public void write() {
		
		System.out.printf("%d %s %d = %d", num1, oper, num2, result);
		
	}
	
}
//출력기는 write사용 Sum의 변수를 사용
class Calc extends Sum {
	//입력;수와 연산자를 나눠서;구분자","로 num1,2,를 지정
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두개의 수 (10,20)?");//10,20
		String su = sc.next();
		
		System.out.print("연산자?");
		oper = sc.next();
		
		su = su.replaceAll("\\s", "");
		String[] s = su.split(",");
		
		num1 = Integer.parseInt(s[0]);
		num2 = Integer.parseInt(s[1]);

	}
		
	public void calc() {
		//else if문 사용;oper의 String값이 연산자와 같으면 결과 계산
		if(oper.equals("+"))	
			result = num1 + num2;
		else if(oper.equals("-"))
			result = num1 - num2;
		else if(oper.equals("*"))
			result = num1 * num2;
			else if(oper.equals("/"))
				result = num1 / num2;
	}	
	
}

public class Test8 {

	public static void main(String[] args) {
		
		Calc ob = new Calc();
		ob.input();
		ob.calc();
		ob.write();
	}

}