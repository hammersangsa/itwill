package com.health2;

import java.util.Scanner;

public class HealthMain {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		Health ob = new HealthImpl();
		
		int ch;
		
		while(true) {
			
			do {
				System.out.print("1.ȸ�������Է� \n2.��� \n3.ȸ���������� \n4.ȸ����ȣ�˻� "
					+ "\n5.ȸ���̸��˻� \n6.Bmi ������������ \n7.Ű ������������ \n8.������ ������������" 
					+ "\n9.ȸ����ȣ ������������ \n10.����");
				System.out.print("\n-----------------------\n");
				System.out.print(": ");
				ch = sc.nextInt();
			}while(ch<1);
			
			switch(ch) {
				case 1: ob.input();break;
				case 2: ob.print();break;
				case 3: ob.deleteNum();break;
				case 4: ob.searchNum();break;
				case 5: ob.searchName();break;
				case 6: ob.ascSortBmi();break;
				case 7: ob.descSortKey();break;
				case 8: ob.descSortKg();break;
				case 9: ob.ascSortNum();break;
				default: 
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
			}
		}
		
	}

}
