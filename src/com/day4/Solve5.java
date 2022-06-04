//5. 두수를 입력받아 적은 수에서 큰수까지의 합
package com.day4;

import java.util.Scanner;

public class Solve5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, max, min;
		int sum;
		sum = 0;

		System.out.println("첫번째 수는?");
		max = sc.nextInt();
		System.out.println("두번째 수는?");
		min = sc.nextInt();

		if (max < min) {
			int temp = min;
			min = max;
			max = temp;
			// 혹은 새 변수(eg:min,max)를 사용하여도 됨.
		}

		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(min + "부터 " + max + "까지 더하면 " + sum + "입니다.");

	}

}
