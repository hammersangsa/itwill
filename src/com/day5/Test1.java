package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// �迭
		// ����
		// int[] num = new int[5];
		int num[] = new int[6];
		Scanner sc = new Scanner(System.in);

		// �Է�
		System.out.print(num.length + "���� ����?"); // 4 6 8 7 2

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		// ���
		System.out.println("�迭�� ����: " + num.length + "��");

		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "]: " + num[i]);

		}

		/*
		 * System.out.println("num[1]: " + num[1]); System.out.println("num[2]: " +
		 * num[2]); System.out.println("num[3]: " + num[3]);
		 * System.out.println("num[4]: " + num[4]); System.out.println("num[5]: " +
		 * num[5]);
		 */
		num[3] = 400;
		System.out.println("num[3]: " + num[3]);

		int su = num[1];
		System.out.println(su + ":" + num[1]);

		num[4] = num[0] + num[1];
		System.out.println("num[4]: " + num[4]);

	}

}
