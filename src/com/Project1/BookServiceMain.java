package com.Project1;

// �ι�° �����ҋ� å��� �����Ǽ� �����°� -�����̶� �����̶� 10��
// �ι�° ��� ����ϰ� �����Ҷ� ���� ���ٰ� ����Ǵ°�


import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookServiceMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BookServiceImpl bs = new BookServiceImpl();

		int ch;

		while (true) {

			do {
				System.out.println("��-----------------------------��");
				System.out.println("��     [���� ���� �ý���]  	      ��");
				System.out.println("��-----------------------------��");
				System.out.print("��1.ȸ�� ���� ���           �� \n��2.��ü ȸ��                  ��\n��3.�����ϱ�                   ��\n��4.���� ��õ                  ��" + "\n��5.�ݳ��ϱ�                   ��"
						+ "\n��6.ȸ�� �˻�                  �� \n��7.����                         ��");
				System.out.print("\n��-----------------------------��\n");
				System.out.print(": ");
				ch = sc.nextInt();

				
			} while (ch < 1);

			switch (ch) {
			case 1: bs.input(); break;
			case 2: bs.print(); break;
			case 3: bs.loan(); break;
			case 4: 
				bs.recommend1();
				bs.start();
				try {
					bs.join();
				} catch (Exception e) {
					// TODO: handle exception }
				}
				bs.recommend2();
				break;
			case 5: bs.delete(); break;
			case 6: bs.findTel(); break;
			
			default:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
		}

	}
}

