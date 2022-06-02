/*2.두 개의 정수를 입력 받고, 
 큰 숫자와 작은 숫자를 구분해서 출력.(if문 이용)
	예) 20, 30 입력시 -> 큰 숫자 30, 작은 숫자 20
*/

package com.day3;

import java.util.Scanner;

public class Solve2 {

	public static void main(String[] args) {

		//선언
		Scanner sc = new Scanner(System.in);
		int num1, num2, temp;
		
		//입력
		System.out.printf("숫자 두개를 입력하세요.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//조건
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		//출력
		System.out.println("큰 숫자: " + num1 + " 작은 숫자: " + num2);
		
	}

}
