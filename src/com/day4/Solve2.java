/*
2. 1���� 100���� ���� Ȧ���� ��, ¦���� ��, ��ü�� ��
¦���� : 2550
Ȧ���� : 2500
�� : 5050
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

		System.out.println("¦����: " + sum1);
		System.out.println("Ȧ����: " + sum2);
		System.out.println("��: " + sum3);

	}

}
