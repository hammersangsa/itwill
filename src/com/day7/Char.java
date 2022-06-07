package com.day7;

import java.io.IOException;

public class Char {
	//선언
	char ch, result;
	
	//입력
	public void input() throws IOException {
		System.out.print("한개의 문자?");
		ch = (char)System.in.read();
	}
	//연산
	public char change()  {

		result = ch>=65 && ch<=90?(char)(ch+32):
			(ch>='a' && ch<='z'?(char)(ch-32):ch);  

		return result;
	}
	//출력
	public void print(char result) {
		System.out.println(ch + ":" + result );
	}
		
}