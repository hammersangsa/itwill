/*
2. 1~10������ ������ �߻����� �߻���Ų ������ 3���ȿ� �˾� ���ߴ� ����
   (3���ȿ� �˾Ƹ����� ���ϸ� �߻��� ������ ���)

��)
�����Է�?[1��°��ȸ] : 3
Ʋ�Ⱦ��!!
�����Է�?[2��°��ȸ] : 5
Ʋ�Ⱦ��!!
�����Է�?[3��°��ȸ] : 7
Ʋ�Ⱦ��!!

������ 2�Դϴ�

����ҷ�?[Y/N] : 
------------------------------
�����Է�?[1��°��ȸ] : 7
Ʋ�Ⱦ��!!
�����Է�?[2��°��ȸ] : 4
Ʋ�Ⱦ��!!
�����Է�?[3��°��ȸ] : 9
�¾Ҿ��!!

������ 9�Դϴ�

����ҷ�?[Y/N] :
 */

package com.day6;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Solve2 {

	public static void main(String[] args) throws IOException {

		// ����
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int i, j, su = 0, k = 0;
		int n = 0;
		char ch;

		while (true) {
			
			num[su] = rd.nextInt(10)+1 ;
			
			for (n = 0; n < 3; n++) {

				System.out.print("�����Է�?[" + (n + 1) + "��°��ȸ] : ");
				k = sc.nextInt();

				if (num[su] != k)
					System.out.println("�����Դϴ�.");

				if (num[su] == k) {
					System.out.println("�����Դϴ�!!");
					break;
				}
			}
			System.out.println("\n������" + num[su] + "�Դϴ�.");

			System.out.print("����Ͻðڽ��ϱ�? [Y/N]");
			ch = (char) System.in.read();

			if (ch != 'y' && ch != 'Y') {
				System.out.println("\n���α׷��� �����մϴ�");
				break;
			}
		}

	}

}
