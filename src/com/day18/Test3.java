package com.day18;

import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader
//1byte stream을 2byte의 stream으로 변환
//Bridge stream



public class Test3 {

	public static void main(String[] args)throws Exception {

		int data;
		System.out.print("문자열 입력?");
		
		Reader rd = new InputStreamReader(System.in);
		
		//하나 넣어놓고 데이터가 없을떄까지 추출/알아두기
		while((data=rd.read())!=-1) {
			char ch = (char)data;
			System.out.print(ch);
		}
	}

}
