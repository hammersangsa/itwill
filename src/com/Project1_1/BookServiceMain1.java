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
				System.out.print("*[1]ȸ������ [2]ȸ������ [3]�����Ͻ� ȸ������ [4]ȸ���˻� [5]����*");
				System.out.println("\n******************************************************************");
				System.out.println("");
				System.out.print("�� ��� �� �ش��ϴ� ��ȣ�� �Է����ּ��� : ");

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
				System.out.println("����!");
				System.exit(0);

			default:
				System.out.println("�߸��Է� �ٽ� �Է����ּ���!");
				break;

			}

		}
	}
}
