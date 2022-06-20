package com.naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Info ob = new InfoImpl();
		
		int ch;
		
		while(true) {
			
			do {
				System.out.print("1.회원가입 \n2.회원정보 \n3.ID검색 \n4.이름검색" 
						+"\n5.종료");
				System.out.print("\n------------------------------\n");
				System.out.print(": ");
				ch = sc.nextInt();
			}while(ch<1);
			
			switch(ch) {
			case 1: ob.input();break;
			case 2: ob.print();break;
			case 3: ob.searchID();break;
			case 4: ob.searchName();break;
			default:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			
		}
		
	}

}
