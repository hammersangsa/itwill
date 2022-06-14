package com.day11;

public class Test5 {

	public static void main(String args[]) {
		
		String s1 = "서울,부산,대구";
		String ss[] = s1.split(",");//split
		
		for(String s : ss)	{
		
			System.out.print(s + " ");
		}
		System.out.println();
		
		String s2 = "seoul";
		String s3 = "Seoul";
		System.out.println(s2==s3);//false
		System.out.println(s2.equals(s3));//false
		
		System.out.println(s2.equalsIgnoreCase(s3));//true
		//대소문자 상관없이 비교하여라
		
		String s4 = "abc.def.hij";
		
		System.out.println(s4.indexOf("."));//3
		System.out.println(s4.lastIndexOf("."));//7
		System.out.println(s4.indexOf("def"));//4		
		System.out.println(s4.indexOf("x"));//-1
		//index= 데이터 내의 값을 찾아라
		//
		String s5 = "우리나라 대한민국 좋은나라 대한민국";
		String s6 = s5.replaceAll("대한", "大韓");
		System.out.println(s6);
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim());//trim== 앞뒤 공백을 없애라
		System.out.println(s7.replaceAll(" ", ""));
		System.out.println(s7.replaceAll("\\s", ""));//정규화표현식
		//regex*정규표현식
		
		//String str = "abcdefg";
		char ch = "abcdefg".charAt(2);
		System.out.println(ch);//2
		System.out.println(Integer.toString(ch));
		
		System.out.println("abcdefg".startsWith("abc"));
		System.out.println("자바프로그램".startsWith("자바"));
		
		System.out.println("abcdefg".length());//7
		
		String s8 = "abcdefg";
		String s9 = "abcdffg";
		
		//사전식 정렬( ASCII코드의 차이)
		System.out.println(s8.compareTo(s9));//Ascii값의 차이-1
		System.out.println(s9.compareTo(s8));//1
		
	}
	
	
}
