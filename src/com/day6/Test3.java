package com.day6;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 10�� �̳��� �̸��� ������ �Է� �޾�
		// ���� ���ϱ�

		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;
		int[] rank;

		int i, j, temp1, inwon;
		String temp2;

		do {
			System.out.println("�ο���[1~10]?");// 3
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		// �迭�� �޸� �Ҵ�(�迭 ��ü����) //�� String, int ����� ����
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];

		for (i = 0; i < inwon; i++) {

			System.out.print((i + 1) + "��° �̸�?");
			name[i] = sc.next();

			System.out.print("����?");
			score[i] = sc.nextInt();
		}

		// ����(rank) �ʱ�ȭ
		for (i = 0; i < inwon; i++)
			rank[i] = 1;

		// selection sort(����{��������}) //score 20 50 70 ���������� �� //�������
		for (i = 0; i < inwon - 1; i++) {

			for (j = i + 1; j < inwon; j++) {
				// ���� ������ rank�� +1 ����
				if (score[i] > score[j])
					rank[j]++;
				else if (score[i] < score[j])
					rank[i]++;

			}
		}

		// ���
		for (i = 0; i < inwon; i++) {
			System.out.printf("%6s %4d %4d\n", name[i], score[i], rank[i]);
		}

	}

}
