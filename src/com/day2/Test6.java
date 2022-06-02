package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {

		//밑변(w)과 높이(h)를 입력받아 삼각형의 넓이(a)를 구하시오.
		//밑변?23.5
		//높이?34.7
		//넓이 : xxx.45
		//넓이 = 밑변 * 높이 / 2
		
		//선언
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		double w, h, a;
		
		//입력
		System.out.print("밑변?");//23.5
		w = Double.parseDouble(br.readLine());
		
		System.out.print("높이?");//34.7
		h = Double.parseDouble(br.readLine());
		
		//연산
		
		a = w * h / 2;
		
		//출력
		System.out.println("넓이 : " + a);
	}

}
