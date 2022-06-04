package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 반복문(for, while, do~while)
		// 선언
		Scanner sc = new Scanner(System.in);

		int dan;

		// 입력
		System.out.print("단을 입력하세요");// 7
		dan = sc.nextInt();

		// for(초기값; 최대값; 증가값){}
		// 반복
		for (int i = 1; i <= 9; i++) {

			// 출력
			System.out.printf("%d * %d = %d\n", dan, i, i * dan);
		}

		System.out.println("---------------------");

		// 초기값
		// while(최댓값){증가값}
		// 배열은 0부터 시작, 변수 i,j,k를 주로 사용
		int j = 0;
		while (j < 9) {
			j++;
			System.out.println(dan + "*" + j + "=" + (dan * j));
		}

		System.out.println("---------------------");

		// 초기값
		// do{증가값}while(최대값)
		// 무조건 1번은 실행
		int k = 0;
		do {
			k++;
			System.out.println(dan + "*" + k + "=" + (dan * k));
		} while (k < 9);

	}

}
