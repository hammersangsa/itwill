package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {

		// ���� �Է¹޾� 1�������� �������� �հ�

		Scanner sc = new Scanner(System.in);

		int su, sum = 0;
		char ch;

		while (true) {// ���ѷ���

			do {
				System.out.print("1~5000������ ���� �Է����ּ���");// 1000
				su = sc.nextInt();
			} while (su < 1 || su > 5000);

			sum = 0;
			// ���� �߰� �ʱ�ȭ
			for (int i = 1; i <= su; i++) {

				sum += i;

			}

			System.out.println("1~" + su + "������ ��: " + sum);

			System.out.print("����Ͻðڽ��ϱ�? [Y/N]");// y,Y,n,N,1,A,�ƴ�
			ch = (char) System.in.read();

			if (ch != 'y' && ch != 'Y') {
				// ������ �����̸� ���ۻ�����
				System.out.println("���α׷��� �����մϴ�.");

				break;
				// break�� while, do~while, for, switch���� ��� ����(���)
			}

		}

	}

}
