package com.day3;

import java.io.IOException;


public class Test3 {

	public static void main(String[] args) throws IOException {

		char ch, result;
		
		//ch = 'a';//97
		//System.out.println(ch);//a
		//System.out.println(Integer.toString(ch));//97
		
		System.out.print("한개의 문자?");//a(97),A(65)
		ch = (char)System.in.read(); //97(57,55)
		//read를 통해 int 형식의 반환값으로 97이 나오고 ch는 
		//97이라는 ascii값을 가지고 있다.
		//이후 char를 통해 형변환 하여 97을 'a'로 변환
		
		result = ch>=65 && ch<=90?(char)(ch+32):
			(ch>='a' && ch<='z'?(char)(ch-32):ch);
			
		System.out.println(ch + ":" + result);	
	}

}
//ch = "a"; String으로 저장해야함
		//ch = 'a'; Char로 가능
		//ch = 'abcd'; String
		//ch = '가'; Char로 가능
		//'a'는 1byte '가'는 2byte char는 2byte.
