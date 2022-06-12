package com.day7;

import java.util.Scanner;

//빈건물
public class Rect {
//파티션 제작

	int w, h; // 전역변수,instance변수
	// 전역변수는 자동으로 int의 초기값 0이 들어가있음
	// 기존의 지역변수는 초기화를 해야함.

	public void input() {
		// void 자리에는 property로서 반환값 자리가 온다.
		// input(매개변수 자리)

		Scanner sc = new Scanner(System.in);
		// 스캐너라는 클래스를 sc를 통해 복사 //system.in=생성자
		// int w,h; //지역변수(local)

		System.out.print("가로?");
		w = sc.nextInt();

		System.out.print("세로?");
		h = sc.nextInt();

		// return;은 void를 사용함으로써 생략

	}

	// 넓이 구하기
	public int area() {

		int result;

		result = w * h;

		return result;
		// int의 형태로 호출한 곳으로 되돌아감
		// 반환값을 담을 변수가 필요함 ex) int a

	}

	// 둘레
	public int length() {

		return (w + h) * 2;
		// 간단하면 간략하게 return값으로 바로 사용
		// 보통 이 방법을 사용

	}

	// 출력
	public void print(int a, int l) {

		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);

	}

}
