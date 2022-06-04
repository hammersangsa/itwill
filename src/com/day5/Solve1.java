//1. 5개의 정수를 입력받아 입력받은 수를 출력하고 입력받은 수중
//가장 큰수와 적은수를 출력

package com.day5;

import java.util.Scanner;

public class Solve1 {

	public static void main(String[] args) {

		// 선언
		Scanner sc = new Scanner(System.in);

		int num[] = new int[5];
		int i, j, max, min;

		// 입력
		System.out.println("숫자 다섯개를 주세요");
		for (i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		// 배열
		for (i = 0; i < num.length - 1; i++) {

			for (j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		// 출력
		max = num[4];
		min = num[0];
		System.out.printf("가장 큰 수: " + max + "\n가장 작은 수: " + min);

	}

}
