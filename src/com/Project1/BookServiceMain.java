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
		System.out.println("	##:::::'##:'########:'##::::::::'######:::'#######::'##::::'##:'########:");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		
		System.out.println("	##:'##: ##: ##.....:: ##:::::::'##... ##:'##.... ##: ###::'###: ##.....::");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		System.out.println("	##: ##: ##: ##::::::: ##::::::: ##:::..:: ##:::: ##: ####'####: ##:::::::");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		System.out.println("	##: ##: ##: ######::: ##::::::: ##::::::: ##:::: ##: ## ### ##: ######:::");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		System.out.println("	##: ##: ##: ##...:::: ##::::::: ##::::::: ##:::: ##: ##. #: ##: ##...::::");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		System.out.println("	##: ##: ##: ##::::::: ##::::::: ##::: ##: ##:::: ##: ##:.:: ##: ##:::::::");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		System.out.println(" 	###. ###:: ########: ########:. ######::. #######:: ##:::: ##: ########:");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		System.out.println("	:...::...:::........::........:::......::::.......:::..:::::..::........::");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		while (true) {

			do {
				System.out.println("");
				System.out.println("**************************************************************************************");
				System.out.println("*                                                                                    *");
				System.out.println("*                                                                                    *");
				System.out.println("*                                                                                    *");
				System.out.println("*                                 ���� ���� �ý���                                   *");
				System.out.println("*                                                                                    *");
				System.out.println("*                                                                                    *");
				System.out.println("*                                                                                    *");
				System.out.println("*                                                                                    *");
				System.out.println("**************************************************************************************");
				System.out.println("");
				System.out.println("                        ��-----------------------------��");
				System.out.println("                        ��            [�޴�]           ��");
				System.out.println("                        ��-----------------------------��");
				System.out.print("                        ��1.ȸ�� ���� ���             �� \n                        ��2.ȸ�� �˻�                  ��\n                        ��3.�����ϱ�                   ��\n                        ��4.�ݳ��ϱ�                   ��" + "\n                        ��5.���� ���                  ��"
						+ "\n                        ��6.���� ����                  �� \n                        ��7.���� ��õ                  ��\n                        ��8.��ü ȸ��                  ��\n                        ��9.���� �Ǹ�                  ��\n                        ��10.����                      ��");
				System.out.print("\n                        ��-----------------------------��\n");
				System.out.print("                         ���Ͻô� ��ȣ�� �Է��ϼ���:  ");
				ch = sc.nextInt();

				
			} while (ch < 1);

			switch (ch) {
			case 1: bs.input(); break;
			case 2: bs.findTel(); break;
			case 3: bs.loan(); break;
			case 4: bs.delete1(); break;
			case 5: bs.add(); bs.list(); break;
			case 6: bs.delete2(); bs.list(); break;
			case 7: 
				bs.recommend1();
				bs.start();
				try {
					bs.join();
				} catch (Exception e) {
					// TODO: handle exception }
				}
				bs.recommend2();
				break;
			
			case 8: bs.print(); break;
			case 9: bs.booksell(); break;
			default:
				System.out.println("");
				System.out.println("                             ���α׷��� �����մϴ�.");
				System.exit(0);
			}
		}

	}
}

