// 1. 5���� ������ �Է¹޾� �Է¹��� ���� ����ϰ� �Է¹��� ����
//   ���� ū���� �������� ���
package com.day6;

import java.util.Scanner;

public class Solve1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i,j,temp,max,min;
		int[] num = new int[5];
		
		System.out.println("5����");
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
		
		System.out.println("ū ��: "+max+" ���� ��: "+min);
	}
}
