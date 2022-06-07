package com.day6;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 10명 이내의 이름과 점수를 입력 받아
		// 점수가 높은 사람 순으로 출력

		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;

		int i, j, temp1, inwon;
		String temp2;

		do {
			System.out.println("인원수[1~10]?");// 3
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// 배열의 메모리 할당(배열 객체생성) //위 String, int 선언과 같다
		name = new String[inwon];
		score = new int[inwon];

		for (i = 0; i < inwon; i++) {

			System.out.print((i + 1) + "번째 이름?");
			name[i] = sc.next();

			System.out.print("점수?");
			score[i] = sc.nextInt();
		}
		for (i = 0; i < inwon; i++) {
			
			System.out.printf("%6s %4d\n",name[i],score[i]);
			
		}

		// selection sort(정렬{내림차순})
		for (i = 0; i < inwon - 1; i++) {

			for (j = i + 1; j < inwon; j++) {

				if (score[i] < score[j]) {
					temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;

					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;

				}

			}
		}

		// 출력
		for (i = 0; i < inwon; i++) {
			System.out.printf("%6s %4d\n", name[i], score[i]);
		}

	}

}
