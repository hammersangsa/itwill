//5. �μ��� �Է¹޾� ���� ������ ū�������� ��
package com.day4;

import java.util.Scanner;

public class Solve5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, max, min;
		int sum;
		sum = 0;

		System.out.println("ù��° ����?");
		max = sc.nextInt();
		System.out.println("�ι�° ����?");
		min = sc.nextInt();

		if (max < min) {
			int temp = min;
			min = max;
			max = temp;
			// Ȥ�� �� ����(eg:min,max)�� ����Ͽ��� ��.
		}

		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(min + "���� " + max + "���� ���ϸ� " + sum + "�Դϴ�.");

	}

}
