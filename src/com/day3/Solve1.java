/*1.정수를 입력 받아서 짝수, 홀수를 구별해서 출력.
	예) 3 입력시 -> 3 => 홀수
	예) 4 입력시 -> 4 => 짝수
*/

package com.day3;

import java.util.Scanner;

public class Solve1 {

	public static void main(String[] args) {

		//선언
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String str = "";
		
		//입력
		System.out.print("숫자를 입력해주세요.");
		num = sc.nextInt();
		
		//조건		
		if(num%2==0) {
			str = "even";
		}else {
			str = "odd";
		}
		//출력
		System.out.print(num + " is " + str );
	}

}
