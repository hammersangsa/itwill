package com.day4;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		//switch
		
		Scanner sc = new Scanner(System.in);
		
		int su;
		
		System.out.println("1~3�̳��� ���� �Է��ϼ���");
		su = sc.nextInt();
		
		switch(su) { //switch �ȿ��� 8�ڷ��� + String���� ����
		case 3:
			System.out.println("***");
			break;
		case 2:
			System.out.println("**");
			break;
		case 1:
			System.out.println("*");
			break;
		default://else
				System.out.println("���� �����Դϴ�.");
		
		
		
		
		}
		
		
		
		
		
		
		
		
	}

}
