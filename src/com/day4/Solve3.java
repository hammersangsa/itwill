/*3. 1-2+3-4+5-6+7-8+9-10 //홀수일 때 + 짝수일 때 -
결과 : -5
*/


package com.day4;

import java.util.Scanner;

public class Solve3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, odd, even;
		odd=even=0;
		
		for(n=1;n<=10;n+=2) {
			odd+=n;
		}
		
		for(n=0;n<=10;n+=2) {
			even-=n;
		}
		
		System.out.println(odd+even);
		
	}

}
