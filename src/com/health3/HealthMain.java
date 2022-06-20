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
				System.out.print("1.회원정보입력 \n2.결과 \n3.회원정보삭제 \n4.회원번호검색 "
					+ "\n5.회원이름검색 \n6.종료");
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
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			}
		}
	}

}
