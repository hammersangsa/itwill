package com.day17;

import java.util.Random;
import java.util.Scanner;

class SelectMember extends Thread {

	@Override
	public void run() {

		System.out.print("�����");
		for (int i = 1; i <= 7; i++) {
			System.out.print(".");

			try {
				Thread.sleep(100);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println();
		System.out.println("---------------------");
		System.out.println("��ǥ�� �����մϴ�!!!");

	}
}

public class RandomMember {
	private static int saram;
	private static String[] name = { "������", "�ȼ���", "����", "�輺��", "���ٿ�", "������", "�̵���", "������", "��ȫ��", "������", "������", "������",
			"�ڼ���", "������", "��â��", "�����", "������", "�ڼ���", "������", "�ɹ���", "��ä��", "�迵��", "�Ƚÿ�", "������", "�ڼ���", "������", "������" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Thread t = new Thread(new SelectMember());
		Random rd = new Random();

		System.out.print("��ǥ�ڴ� ����Դϱ�???");// 5
		saram = sc.nextInt();

		t.start();

		try {
			t.join();
		} catch (Exception e) {

		}

		int j = 0;

		while (j < saram) {

			int r = rd.nextInt(name.length);

			for (int k = 0; k < j; k++) {
				if (name[k] == (name[j])) {
					j--;
					break;
				}
			}
			j++;
			System.out.print(j + "�� ��ǥ�� :" + name[j] + "\n");
		}

	}

}
