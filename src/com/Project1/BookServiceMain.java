package com.Project1;

import java.util.Scanner;



public class BookServiceMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BookService bs = new BookServiceImpl();
		
		int ch;
		
		while(true) {
			
			do {
				System.out.print("1.입력 \n2.출력 \n3.대출 \n4.학번검색 "
					+ "\n5.반납 \n6.총점내림차순정렬 \n7.학번오름차순정렬 \n8.종료");
				System.out.print("\n-----------------------\n");
				System.out.print(": ");
				ch = sc.nextInt();
			}while(ch<1);
			
			switch(ch) {
				case 1: bs.input();break;
				case 2: bs.print();break;
				case 3: bs.select();break;
				case 4: bs.recommend();break;
				case 5: bs.delete();break;
				case 6: bs.findTel();break;
				default: 
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			}
		}
		
	}

}
