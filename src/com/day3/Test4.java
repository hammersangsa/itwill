package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		//제어문
		//if, switch, 반복문(for, while, do~while)
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num;
		String str = "";//null로 초기화
		
		System.out.print("수입력?");//50
		num = Integer.parseInt(br.readLine());
		
		//if(조건식){작업}
		//if 문의 중괄호는 생략 가능
		//단일if : '조건의 작업이 1'
		/*
		if(num%2==0) {
			str = "even";
		}
		
		if(num%2!=0) {
			str = "odd";
		}
		*/
		
		//if~else : '조건의 작업이 2'
		if(num%2==0) {
			str =  "even";
		}else {
			str = "odd";
			}
		
		System.out.println(num + " : " + str);
		
		
	}

}
