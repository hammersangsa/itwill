package com.health2;

import java.util.Scanner;

public class HealthMain {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		Health ob = new HealthImpl();
		
		int ch;
		
		while(true) {
			
			do {
				System.out.print("1.회원정보입력 \n2.결과 \n3.회원정보삭제 \n4.회원번호검색 "
					+ "\n5.회원이름검색 \n6.Bmi 오름차순정렬 \n7.키 내림차순정렬 \n8.몸무게 내림차순정렬" 
					+ "\n9.회원번호 오름차순정렬 \n10.종료");
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
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			}
		}
		
	}

}
