//1. 5���� ������ �Է¹޾� �Է¹��� ���� ����ϰ� �Է¹��� ����
//���� ū���� �������� ���

package com.day5;

import java.util.Scanner;

public class Solve1 {

	public static void main(String[] args) {

		// ����
		Scanner sc = new Scanner(System.in);

		int num[] = new int[5];
		int i, j, max, min;

		// �Է�
		System.out.println("���� �ټ����� �ּ���");
		for (i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		// �迭
		for (i = 0; i < num.length - 1; i++) {

			for (j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		// ���
		max = num[4];
		min = num[0];
		System.out.printf("���� ū ��: " + max + "\n���� ���� ��: " + min);

	}

}
