package com.day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num[] = new int[5];
		int i, j, temp;

		System.out.println("���� �ټ���?");
		for (i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
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
			// Ȯ��for�� �迭�϶� Num�� ũ�⸸ŭ ������ ����
			// ������� ���Խ��� ��½�Ų��.
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