package com.Project1;

import java.util.Scanner;



public class BookServiceMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BookService bs = new BookServiceImpl();
		
		int ch;
		
		while(true) {
			
			do {
				System.out.print("1.�Է� \n2.��� \n3.���� \n4.�й��˻� "
					+ "\n5.�̸��˻� \n6.���������������� \n7.�й������������� \n8.����");
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
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
			}
		}
		
	}

}
