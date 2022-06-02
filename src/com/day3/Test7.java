package com.day3;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		//3개의 수를 입력받아 작은 수에서 큰 수 순으로 정렬
		//선언
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, temp;

		//입력
		System.out.println("3가지 수를 입력해주세요");//6 10 5
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		//조건
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if(num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		//출력
		System.out.printf("%d, %d, %d", num1, num2, num3);//5 6 10
		sc.close();
	}

}
