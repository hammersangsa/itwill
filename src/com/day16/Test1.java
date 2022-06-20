package com.day16;

import java.util.InputMismatchException;
import java.util.Scanner;

//Exception Ŭ����(����ó��)

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1,num2,result;
		String oper;
		
		try {
			System.out.print("�ΰ��� ��?");//10 20
			
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("������?");//+
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
			
			//ó���� ����� e�� ����
		} catch(InputMismatchException e) {
			System.out.println(e.toString());
			System.out.println("������ �Է����ּ���");
			
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�");
			
		} catch (Exception e) {
			//e.printStackTrace();
			
			System.out.println("�� �� ����");
			
		}
		
	}

}
