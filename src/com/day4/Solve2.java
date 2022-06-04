/*
2. 1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합
짝수합 : 2550
홀수합 : 2500
합 : 5050
*/

package com.day4;

import java.util.Scanner;

public class Solve2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0, sum1, sum2, sum3;

		sum1 = sum2 = sum3 = 0;

		while (n < 100) {
			n++;
			if (n % 2 == 0)
				sum1 += n;
			else
				sum2 += n;

			sum3 += n;
		}

		System.out.println("짝수합: " + sum1);
		System.out.println("홀수합: " + sum2);
		System.out.println("합: " + sum3);

	}

}
