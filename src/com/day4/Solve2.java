/*
2. 1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합
짝수합 : 2550
홀수합 : 2500
합 : 5050
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
		
	
		System.out.println("짝수합: " + sum1);
		System.out.println("홀수합: " + sum2);
		System.out.println("합: " + tot);

	}

}
