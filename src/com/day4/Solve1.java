/*1. (1)+(1+2)+(1+2+3)+...+(1+2+3+...+10)
��� : 220
*/

package com.day4;

import java.util.Scanner;

public class Solve1 {

	public static void main(String[] args) {

		//����
		Scanner sc = new Scanner(System.in);
		
		int n, sum1, sum2;
		sum1=0;
		sum2=0;
		
		//�ݺ�
		for(n=1;n<=10;n++) {
			sum1=sum1+n;
			sum2=sum2+sum1;
		}
		
		System.out.println(sum2);
		
	}

}
