package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) throws IOException {

		//����
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		char oper;
		
		//�Է�
		System.out.println("ù��° ���ڴ�?");
		num1 = sc.nextInt();
		
		System.out.println("�ι�° ���ڴ�?");
		num2 = sc.nextInt();
		
		System.out.print("������[+,-,*,/] �� ������");//+
		oper = (char)System.in.read();
		
		//switch
		switch(oper) {//char�� ǥ��� ' ' �� ���
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
				System.out.println("�߸��� �������Դϴ�");
		}
		
	}

}
