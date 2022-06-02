package com.day4;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		//switch
		
		Scanner sc = new Scanner(System.in);
		
		int su;
		
		System.out.println("1~3이내의 수를 입력하세요");
		su = sc.nextInt();
		
		switch(su) { //switch 안에는 8자료형 + String까지 가능
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
				System.out.println("숫자 오류입니다.");
		
		
		
		
		}
		
		
		
		
		
		
		
		
	}

}
