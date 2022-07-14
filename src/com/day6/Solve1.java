// 1. 5개의 정수를 입력받아 입력받은 수를 출력하고 입력받은 수중
//   가장 큰수와 적은수를 출력
package com.day6;

import java.util.Scanner;

public class Solve1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i,j,temp,max,min;
		int[] num = new int[5];
		
		System.out.println("5숫자");
		for(i=0;i<5;i++) {
			num[i] = sc.nextInt();
		}
		
		for(i=0;i<num.length-1;i++) {
			for(j=i+1;j<num.length;j++) {
				
				if(num[i]>num[j]) {
					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
				
			}
		}
		max = num[4];
		min = num[0];
		
		System.out.println("큰 수: "+max+" 작은 수: "+min);
	}
}
