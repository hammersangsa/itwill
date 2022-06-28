package com.Project1_1;

import java.util.Scanner;

import com.Project1.BookServiceMain;

public class BookServiceMain1 extends BookServiceMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BookServiceImpl1 ob = new BookServiceImpl1();

		int ch;

		while (true) {
			do {
				System.out.println("");
				System.out.println("******************************************************************");
				System.out.print("*[1]회원가입 [2]회원정보 [3]삭제하실 회원정보 [4]회원검색 [5]종료*");
				System.out.println("\n******************************************************************");
				System.out.println("");
				System.out.print("위 기능 중 해당하는 번호를 입력해주세여 : ");

				ch = sc.nextInt();
			} while (ch < 1 || ch > 6);

			switch (ch) {
			case 1:
				ob.input();
				main1(args);
				break;
			case 2:
				ob.print();
				break;
			case 3:
				ob.delete();
				break;
			case 4:
				ob.findTel();
				break;
			case 5:
				System.out.println("종료!");
				System.exit(0);

			default:
				System.out.println("잘못입력 다시 입력해주세여!");
				break;

			}

		}
	}
}
