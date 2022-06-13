package com.day11;

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
	
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("계산기 실행");
		String str = sc.nextLine();
		
		str = str.replaceAll("\\s", "");
		
		
		for(String op : new String[] {"+", "-", "*", "/"}) {
			
			int find = str.indexOf(op);
			
			if(find>-1) {
				
			 num1 = Integer.parseInt(str.substring(0,find));
			 num2 = Integer.parseInt(str.substring(find+1));
			 result = 0;
			 	
				switch(oper) {
				
				case "+":
					result = num1 + num2; break;
				case "-":
					result = num1 - num2; break;
				case "*":
					result = num1 * num2; break;
				case "/":
					result = num1 / num2; break;
				}
				write();
	
			}
			
		}
			
	}
	
}

public class Test8 {

	public static void main(String[] args) {
		
		Calc c = new Calc();
		Sum s = new Sum();
		
		
		c.input();
		s.write();
		
	}

}
