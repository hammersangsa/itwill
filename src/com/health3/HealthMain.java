package com.health3;

import java.util.Scanner;

import com.score5.Score;
import com.score5.ScoreImpl;

public class HealthMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Health ob = new HealthImpl();
		
		int ch;
		
		while(true) {
			
			do {
				System.out.print("1.ȸ�������Է� \n2.��� \n3.ȸ���������� \n4.ȸ����ȣ�˻� "
					+ "\n5.ȸ���̸��˻� \n6.����");
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

				default: 
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
			}
		}
	}

}
