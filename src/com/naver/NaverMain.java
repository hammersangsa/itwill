package com.naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Info ob = new InfoImpl();
		
		int ch;
		
		while(true) {
			
			do {
				System.out.print("1.ȸ������ \n2.ȸ������ \n3.ID�˻� \n4.�̸��˻�" 
						+"\n5.����");
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
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
			
		}
		
	}

}
