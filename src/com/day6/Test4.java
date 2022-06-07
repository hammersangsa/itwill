package com.day6;

public class Test4 {

	public static void main(String[] args) {

		// bubble sort 비교
		// selection sort는 작은 수를 앞으로 가져오지만
		// bubble sort는 큰 수를 뒤로 보내는 순서
		int[] num = { 28, 20, 15, 10, 8 };

		int i, j, temp;

		System.out.print("source data :");
		for (int su : num) {
			System.out.printf(" %4d", su);
		}
		System.out.println();

		// bubble sort
		for (i = 1; i < num.length; i++) {

			for (j = 0; j < num.length - i; j++) {

				// System.out.println(j + ":" + (j+1));

				if (num[j] > num[j + 1]) {

					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}

		}

		System.out.print("source data :");
		for (int su : num) {
			System.out.printf(" %4d", su);
		}
		System.out.println();

	}

}
