/*4. 1���� 100������ ���� 3�� ����� ����
3�� ����� ���� : 33
*/

package com.day4;

import java.util.Scanner;

public class Solve4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, cnt;
		cnt = 0;

		for (n = 1; n <= 100; n++) {

			if (n % 3 == 0)
				cnt++;

		}

		System.out.println(cnt);

	}

}
