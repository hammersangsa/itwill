package com.Project1;

import java.util.Scanner;

public class BookServiceMain {

	public static void main1(String[] args) {

		Scanner sc = new Scanner(System.in);

		BookService bs = new BookServiceImpl();

		int ch;

		while (true) {

			do {
				System.out.print("1.도서등록 \n2.대출 \n3.도서추천 \n4.도서반납 \n5.전화번호검색 \n6.종료");
				System.out.print("\n-----------------------\n");
				System.out.print(": ");
				ch = sc.nextInt();
			} while (ch < 1);

			switch (ch) {
			case 1:
				bs.input();
				break;
			case 2:
				bs.select();
				break;
			case 3:
				bs.recommend();
				break;
			case 4:
				bs.delete();
				break;
			case 5:
				bs.findTel();
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}

}
