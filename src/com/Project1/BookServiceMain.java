package com.Project1;

import java.util.Scanner;

public class BookServiceMain {

	public static void main1(String[] args) {

		Scanner sc = new Scanner(System.in);

		BookService bs = new BookServiceImpl();

		int ch;

		while (true) {

			do {
				System.out.print("1.������� \n2.���� \n3.������õ \n4.�����ݳ� \n5.��ȭ��ȣ�˻� \n6.����");
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
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}

	}

}
