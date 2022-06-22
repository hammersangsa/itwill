package com.day18;

//Stream
//데이터 입출력 시 모든 데이터의 형태와는 관계없이
//단방향 흐름으로 데이터를 전송하는 클래스이다

//in : 입력의 기본 stream(byte stream)

public class Test1 {

	public static void main(String[] args) throws Exception{

		int data;
		
		System.out.print("문자열?");//abcd
		while((data=System.in.read())!=-1) {
			
			char ch = (char) data;
			System.out.print(ch);
			
		}
	}

}
