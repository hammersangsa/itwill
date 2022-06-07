package com.day7;

import java.util.Scanner;

public class AsumB {
	//선언
	int n, max, min;
	int sum;
	
	Scanner sc = new Scanner(System.in);
	
	//입력
	public void input() {
		System.out.println("두 수를 입력하세요");
		max = sc.nextInt();
		min = sc.nextInt();
	}
	
	//조건
	public int Sum() {
		if (max < min) {
			int temp = min;
			min = max;
			max = temp; 
		}
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	
	//출력
	public void print(int sum) {
		System.out.println(min + "부터 " + max + "까지 더하면 " + sum + "입니다.");
	}
}
