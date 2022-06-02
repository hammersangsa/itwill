/*3. 네 개의 정수를 입력 받고, 
  제일 큰 숫자와 제일 작은 숫자를 구분해서 출력.(if문 이용)
	예) 20, 30, 40, 50 입력시 -> 제일 큰 숫자 50, 제일 작은 숫자 20
 */
package com.day3;

import java.util.Scanner;

public class Solve3 {

	public static void main(String[] args) {
		
		//선언
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4, temp;
		
		//입력
		System.out.println("숫자 네개 내놔");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		//조건
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if(num2 < num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		if(num3 < num4) {
			temp = num3;
			num3 = num4;
			num4 = temp;
		}
		
		if(num2 < num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if(num2 < num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		//출력
		System.out.println("Max: " + num1 + " Min: " + num4 );
	}

}
//max 와 min을 통해 풀이 가능