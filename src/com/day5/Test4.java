package com.day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num[] = new int[5];
		int i, j, temp;

		System.out.println("숫자 다섯개?");
		for (i = 0; i < num.length; i++) {
			num[i] = sc.nextInt()+1;
		}

		System.out.print("Source Data: ");

		for (i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}

		System.out.println();

		// Selection Sort
		for (i = 0; i < num.length - 1; i++) {

			for (j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {
					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
				// System.out.println(i + ":" + j);
			}
		}
		System.out.print("Sorted Data: ");
		for (int su : num) {
			// 확장for문 배열일때 Num의 크기만큼 변수에 값을
			// 순서대로 대입시켜 출력시킨다.
			System.out.printf("%4d", su);
		}

		System.out.println();

		/*
		 * for(i=0;i<num.length;i++) {
		 * 
		 * System.out.printf("%4d", num[i]); }
		 * 
		 * System.out.println();
		 * 
		 * //Selection Sort for(i=0;i<num.length-1;i++) {
		 * 
		 * for(j=i+1;j<num.length;j++) {
		 * 
		 * if(num[i]>num[j]) { }
		 * 
		 * } }
		 */
	}
}