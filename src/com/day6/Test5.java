package com.day6;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		// �ֹε�Ϲ�ȣ ���ϴ� ���

		Scanner sc = new Scanner(System.in);
		// index : 01234567890123
		// jumin : 900110-2053126
		// chk   : 234567 892345

		// ��=(9*2)+(0*3)+...+(2*5)
		// ��=11-��%11
		// ��=��%10
		// ��==6

		String jumin;
		int[] chk = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int i, tot, su;

		System.out.print("�ֹι�ȣ[xxxxxx-xxxxxxx]?");
		jumin = sc.next();

		if (jumin.length() != 14) {
			System.out.println("�Է� ����!");
			return;// stop
		}

		tot = 0;
		// index : 01234567890123
		// jumin : 900110-2053126
		// chk : 234567 892345
		// ��ȣ�� ���� �ٽÿ� ������ �˻��ϴ� ���ڴ� ���� 12�� ���
		for (i = 0; i < 12; i++) {

			if (i >= 6) {// ���ڸ� ��
				tot += chk[i] * Integer.parseInt(jumin.substring(i + 1, i + 2));// 1���� +2 ���� �������� �ٽø� ����ؾ��ϱ� �����̴�.
			} else {// �������
				tot += chk[i] * Integer.parseInt(jumin.substring(i, i + 1));//+=�� �����ؼ� ��� �� �� ��ȣ
			}
		}
		
		su = 11 - tot % 11;
		su = su & 10;

		if (su == Integer.parseInt(jumin.substring(13))) {
			System.out.println("���ѹα� �����Դϴ�");
		} else {
			System.out.println("�� ������?");
		}

	}

}

/*
 * String str = "seoul korea"; //index : 01234567890 �� ���������.
 * 
 * System.out.println(str.substring(0, 3));//3���� 1�� ������� �ϱ⶧���� seo ���� �д´�.
 * System.out.println(str.substring(6, 8));
 * System.out.println(str.substring(6);//6��° ���� ������ ��� �ȴ�.
 */