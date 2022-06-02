package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));
		//ascii값에 해당하는 기호를 in에 입력하게된다=ISR
		
		//System.in : 키보드로 입력한 1byte의 문자를 입력 받음(한글2byte)
		//InputStreamReader : System.in으로 받은 문자를 2byte로 변경
		//BufferedReader : 2byte로 변경된 문자를 저장 (br=변수)
		//br.을 읽는 method=readLine()
		int r;
		double area, length;
		
		System.out.print("반지름?");//212
		
		r = Integer.parseInt(br.readLine());
		//r = Double.parseDouble(br.readLine());
		
		area = r*r*3.14;
		length = r*2*3.14;
		
		System.out.println("반지름: " + r);
		System.out.println("넓이: " + area);
		System.out.println("둘레: " + length);		
	}

}
