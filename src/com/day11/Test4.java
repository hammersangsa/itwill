package com.day11;

public class Test4 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		//class처럼 사용
		
		sb.append("서울");
		sb.append("부산");
		
		
		System.out.printf("%s\n", sb);
	
		String str = sb.toString();
		System.out.println(str);
		
		
	}

}
