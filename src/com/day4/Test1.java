package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// �ݺ���(for, while, do~while)
		// ����
		Scanner sc = new Scanner(System.in);

		int dan;

		// �Է�
		System.out.print("���� �Է��ϼ���");// 7
		dan = sc.nextInt();

		// for(�ʱⰪ; �ִ밪; ������){}
		// �ݺ�
		for (int i = 1; i <= 9; i++) {

			// ���
			System.out.printf("%d * %d = %d\n", dan, i, i * dan);
		}

		System.out.println("---------------------");

		// �ʱⰪ
		// while(�ִ�){������}
		// �迭�� 0���� ����, ���� i,j,k�� �ַ� ���
		int j = 0;
		while (j < 9) {
			j++;
			System.out.println(dan + "*" + j + "=" + (dan * j));
		}

		System.out.println("---------------------");

		// �ʱⰪ
		// do{������}while(�ִ밪)
		// ������ 1���� ����
		int k = 0;
		do {
			k++;
			System.out.println(dan + "*" + k + "=" + (dan * k));
		} while (k < 9);

	}

}
