package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		// ���� �Է¹޾� 1�������� �������� �հ�

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int su, sum = 0;
		char ch;

		while (true) {// ���ѷ���

			do {
				System.out.print("1~5000������ ���� �Է����ּ���");// 100e
				su = Integer.parseInt(br.readLine());
			} while (su < 1 || su > 5000);

			sum = 0;
			// ���� �߰� �ʱ�ȭ
			for (int i = 1; i <= su; i++) {
				sum += i;
			}

			System.out.println("1~" + su + "������ ��: " + sum);

			System.out.print("����Ͻðڽ��ϱ�? [Y/N]");// ye
			ch = (char) System.in.read();

			if (ch != 'y' && ch != 'Y') {
				System.out.println("���α׷��� �����մϴ�.");
				break;
				// break�� while, do~while, for, switch���� ��� ����(���)
			}

			System.in.skip(2);
			// ascii�� �ΰ��� ó��
		}

	}

}
