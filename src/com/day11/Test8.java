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
//��±�� write��� Sum�� ������ ���
class Calc extends Sum {
	//�Է�;���� �����ڸ� ������;������","�� num1,2,�� ����
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ΰ��� �� (10,20)?");//10,20
		String su = sc.next();
		
		System.out.print("������?");
		oper = sc.next();
		
		su = su.replaceAll("\\s", "");
		String[] s = su.split(",");
		
		num1 = Integer.parseInt(s[0]);
		num2 = Integer.parseInt(s[1]);

	}
		
	public void calc() {
		//else if�� ���;oper�� String���� �����ڿ� ������ ��� ���
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