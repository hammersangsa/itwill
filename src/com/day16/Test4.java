package com.day16;

import java.util.Scanner;

//5~10자 이내의 문자열을 입력받아서 출력하는 프로그램
//조건
//1.5~10자 이내의 문자열
//2.영문자만 입력

class MyAuthen{
	
	public void inputFormat(String str) throws Exception{
		
		//1.5~10자 이내의 문자열
		//문자열의 길이는 5~10자 입니다.
		if(str.length()<5 || str.length()>10) {
			throw new Exception("문자열의 길이는 5~10자입니다");
		}
		
		//2.영문자만 입력
		//영문자만 가능합니다.
		int num = 0, eng = 0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
//			if((ch<65 || ch>90) && (ch<97 || ch>122)) {
//				throw new Exception("영문자만 가능합니다");
//			}
		//3.영문자 숫자 혼용	
			if(ch>='0' && ch<='9') {
				num++;
			}else if((65<=ch && ch<=90) || (ch>=97 && ch<=122)) {
				eng++;
			}
			
		}
		//반복문이 다 끝난 뒤 값을 비교
		if(num==0 || eng==0) {
				throw new  Exception("영문자 숫자 혼용만 가능합니다");
		}
		
	}
	
}

public class Test4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		
		MyAuthen auth = new MyAuthen();
		
		try {
			
			System.out.print("문자열?");//abcsda
			str = sc.next();
			
			auth.inputFormat(str);
			
			System.out.println(str);
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
				
	}

}
