package com.score4;

import java.util.Scanner;

public class ScoreMain {
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		Score ob = new ScoreImpl();
		
		int ch;
		
		while(true) {
		
			do {
				System.out.print("1.�Է� \n2.��� \n3.�й����� \n4.�й��˻� "
					+ "\n5.�̸��˻� \n6.���������������� \n7.�й������������� \n8.����");
				System.out.print("\n-----------------------\n");
				System.out.print(": ");
				ch = sc.nextInt();
			}while(ch<1);
			
			switch(ch) {
				case 1: ob.input();break;
				case 2: ob.print();break;
				case 3: ob.deleteHak();break;
				case 4: ob.searchHak();break;
				case 5: ob.searchName();break;
				case 6: ob.descSortTot();break;
				case 7: ob.ascSortHak();break;
				default: 
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
			}
		}
		
	}

}
	
		/*ScoreVO vo = new ScoreVO();
		
		//vo.set("111", "����", 60, 70, 80);
		
		vo.setHak("a123");//�й��� �ʱ�ȭ
		vo.setName("�����");
		vo.setKor(90);
		vo.setEng(80);
		vo.setMat(70);
		
		System.out.println(vo.toString());
				
		System.out.println(vo.getHak());
		System.out.println(vo.getEng());
		*/
		
		
		/*
		ScoreVO vo1 = new ScoreVO("222", "����", 80, 90, 100);
		
		System.out.println(vo1.toString());
		*/