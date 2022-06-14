package com.day11;

import java.util.Scanner;

class Sum1 {
	
	protected int num1, num2, result;
	protected String oper;
		
	public void write() {
		
		System.out.printf("%d %s %d = %d", num1, oper, num2, result);
		
	}
	
}
//��±�� write��� Sum�� ������ ���
class Calc1 extends Sum1{
	
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("���� ����");
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

public class Test9 {

	public static void main(String[] args) {
		
		Calc1 c = new Calc1();
		Sum1 s = new Sum1();
		
		
		c.input();
		s.write();
	}
}