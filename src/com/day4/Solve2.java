/*
2. 1���� 100���� ���� Ȧ���� ��, ¦���� ��, ��ü�� ��
¦���� : 2550
Ȧ���� : 2500
�� : 5050
*/

package com.day4;

import java.util.Scanner;

public class Solve2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, sum1, sum2;
		sum1=sum2=0;
		
		for(n=0;n<=100;n+=2) {
			sum1=sum1+n;
		}
		
		for(n=1;n<=100;n+=2) {
			sum2=sum2+n;
		}
		
		int tot=sum1+sum2;
		
	
		System.out.println("¦����: " + sum1);
		System.out.println("Ȧ����: " + sum2);
		System.out.println("��: " + tot);

	}

}
