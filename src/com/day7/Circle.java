package com.day7;

import java.util.Scanner;

public class Circle {

	//선언
	int r;
	float area, length;
		
	//입력
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요");
		r=sc.nextInt();
	}
	//연산
	public float area() {
		
		return (r*r*3.14f);
	}
		
	public float length() {
			
		return (2*r*3.14f);

	}
	//출력
	public void print(float area, float length) {
		System.out.println("넓이: " + area + "둘레: " + length);
	}
		
}