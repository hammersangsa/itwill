package com.day6;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {

		// 1~45������ ���� 6���� "����"�� �߻����� ũ������� ����

		Random rd = new Random();// �����̶�� Ŭ���� ��ü ����

		int[] num = new int[6];

		int i, j, temp, n;

		n = 0;

		while (n < 6) {

			num[n] = rd.nextInt(45) + 1;
			//45���� ���ڸ� ����
			for (i = 0; i < n; i++) {

				if (num[i] == num[n])// == ���� ��¶� {
					n--;// -
				break;
			}

			n++;

		} // �������� ������ ���ڸ� ���� ������
		for (i = 0; i < num.length - 1; i++) {

			for (j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {

					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}

			}

		}
		System.out.print("�ζ� ��ȣ :");
        //45���� ���� �߿� �������� ���ڸ� �̾Ƴ��� for���� ��¹�
		for (int su : num) {
			
			System.out.printf("%4d", su);
		}

	}

}
